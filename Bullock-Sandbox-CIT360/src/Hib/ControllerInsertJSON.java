/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author BULLOJP
 */

public class ControllerInsertJSON {
  
    
    static void AddUser() {
        // moved session factory to Model
   // Session session = DBConnect.getSessionFactory().getCurrentSession();
  //  Transaction transaction = session.beginTransaction();
        
       DB_jason_json person = new DB_jason_json();
       person.setJson_id("0003");
       person.setLax_json("Jason");
       person.setStrict_json("Jason@gmail.com");
       person.setUnique_json("8005551212");
       //to save to database
       Model.addPerson(person);
      // session.flush();
       //session.close(); 
      // System.out.println(person);
      System.out.println("USER ADDED!!!!!");
  //
                          }
    
   		
 
static void listUsers() {
		List<DB_jason_json> userList = Model.queryAllUsers();
		
		System.out.println();
		System.out.println("Users in Database");
		System.out.printf("%-5s%-16s%-16s%-20s\n","ID","First Name","Last Name","Gender");
		System.out.printf("%-5s%-16s%-16s%-20s\n","--","----------","---------","------");
		
		Iterator<DB_jason_json> ownerIterator = userList.iterator();
		
		while(ownerIterator.hasNext()) {
			
			DB_jason_json element = ownerIterator.next();
			System.out.printf("%-5s%-16s%-16s%-20s\n",element.getId(),element.getJsonId(),
					element.getLax_json(),element.getStrict_json());
			
}

    
}
 static void doThat() throws MalformedURLException, JSONException{
                       
           
           //URL Url = new URL("http://api.wunderground.com/api/4228dd85f026caea/conditions/q/Colorado/COS.json");
              URL Url = new URL("http://api.wunderground.com/api/4228dd85f026caea/conditions/q/Mexico/Cancun.json");
                          //This next URL is still being played with. Some of the formatting is hard to figure out, but Wunderground 
                              //writes a perfectly formatted JSON file that is easy to read with Java.
                        // URL Url = new URL("https://api.darksky.net/forecast/08959bb1e2c7eae0f3d1fafb5d538032/38.886,-104.7201");
                               
                        try {
                                
                            
                            HttpURLConnection urlCon = (HttpURLConnection) Url.openConnection();
                            
    //          This part will read the data returned thru HTTP and load it into memory
    //          I have this code left over from my CIT260 project.
			InputStream stream = urlCon.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			StringBuilder result = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null) {
			    result.append(line);
			}
                        
                        

                        // The next lines read certain parts of the JSON data and print it out on the screen
			//Creates the JSONObject object and loads the JSON file from the URLConnection
                        //Into a StringWriter object. I am printing this out in raw format just so I can see it doing something
                        
                        
                        JSONObject json = new JSONObject(result.toString());
			
                        JSONObject coloradoInfo = (JSONObject) json.get("current_observation");
                        
                        StringWriter out = new StringWriter();
                        json.write(out);
                        String jsonTxt = json.toString();
                        System.out.print(jsonTxt);
                        
                       // List<String> list = new ArrayList<>();
                       // JSONArray array = json.getJSONArray(jsonTxt);
                       // System.out.print(jsonTxt);
                        
                        DB_jason_json person = new DB_jason_json();
                        person.setJson_id(coloradoInfo.getString("temperature_string"));
                        person.setLax_json(coloradoInfo.getJSONObject("display_location").getString("city"));
                        person.setStrict_json(coloradoInfo.getJSONObject("display_location").getString("state_name"));
                        person.setUnique_json(coloradoInfo.getString("wind_string"));
                        
                        Model.addPerson(person);
                          // session.flush();
                           //session.close(); 
                          // System.out.println(person);
                        System.out.println("JSON ADDED!!!!!");
                     
                        
                        }
                        
                        catch(IOException e){
			System.out.println("***ERROR*******************ERROR********************. "
					+ "\nURL: " + Url.toString() + "\nERROR: " + e.toString());
                       // for (int i =0;i<array.length();i++){
                         //list.add(array.getJSONObject(i).getString("current_observation"));
                        //}
                       
   
       
   }
       }
}




