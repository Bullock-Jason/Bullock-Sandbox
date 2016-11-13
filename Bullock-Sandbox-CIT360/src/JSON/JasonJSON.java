/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author BULLOJP
 */
public class JasonJSON {
    	public static void main(String[] args) throws Exception{
            
                            URL Url = new URL("http://api.wunderground.com/api/22b4347c464f868e/conditions/q/Colorado/COS.json");
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
			JSONObject json = new JSONObject(result.toString());
			
                        JSONObject coloradoInfo = (JSONObject) json.get("current_observation");
                       

                        String wunderGround = "Data downloaded from: " + 
                                
                                coloradoInfo.getJSONObject("image").getString("title") +
                                "\nLink\t\t: " + 
                                coloradoInfo.getJSONObject("image").getString("link") +
                                "\nCity\t\t: " +  
                                coloradoInfo.getJSONObject("display_location").getString("city") +
                                "\nState\t\t: " + 
                                coloradoInfo.getJSONObject("display_location").getString("state_name") +
                                "\nTime\t\t: " + 
                                coloradoInfo.get("observation_time_rfc822") +
                                "\nTemperature\t\t: " +
                                coloradoInfo.get("temperature_string") +
                                "\nWindchill\t\t: " + 
                                coloradoInfo.get("windchill_string") +
                                "\nRelative Humidity\t: " + 
                                coloradoInfo.get("relative_humidity") +
                                "\nWind\t\t\t: " + 
                                coloradoInfo.get("wind_string") +
                                "\nWind Direction\t\t: " + 
                                coloradoInfo.get("wind_dir") +
                                "\nBarometer Pressure\t\t: " +
                                coloradoInfo.get("pressure_in");
			
			System.out.println("\nColorado Springs Weather:");
			System.out.println("____________________________________");
			System.out.println(wunderGround);
		}
		catch(IOException e){
			System.out.println("***ERROR*******************ERROR********************. "
					+ "\nURL: " + Url.toString() + "\nERROR: " + e.toString());
                }
                            
                             
                            }
}


