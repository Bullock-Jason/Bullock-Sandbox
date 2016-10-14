/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;
import org.json.JSONArray;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author BULLOJP
 */
public class JasonJSON {
    	public static void main(String[] args) throws Exception{
            
                            URL Url = new URL("http://api.wunderground.com/api/22b4347c464f868e/conditions/q/Colorado/COS.json");
                          // URL Url = new URL("https://api.darksky.net/forecast/08959bb1e2c7eae0f3d1fafb5d538032/38.886,-104.7201");
                               
                            try {
                                
                            
                            HttpURLConnection urlCon = (HttpURLConnection) Url.openConnection();
                            
    //          This part will read the data returned thru HTTP and load it into memory
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
                       

                        String wunderGround = "Data obtained from: " + coloradoInfo.getJSONObject("image").getString("title") +
                                "\nLink\t\t: " + coloradoInfo.getJSONObject("image").getString("link") +
                                "\nCity\t\t: " +  coloradoInfo.getJSONObject("display_location").getString("city") +
                                "\nState\t\t: " + coloradoInfo.getJSONObject("display_location").getString("state_name") +
                                "\nTime\t\t: " + coloradoInfo.get("observation_ime_rfc822") +
                                "\nTemperature\t\t: " + coloradoInfo.get("temperature_string") +
                                "\nWindchill\t\t: " + coloradoInfo.get("windchill_string") +
                                "\nRelative Humidity\t: " + coloradoInfo.get("relative_humidity") +
                                "\nWind\t\t\t: " + coloradoInfo.get("wind_string") +
                                "\nWind Direction\t\t: " + coloradoInfo.get("wind_dir") +
                                "\nBarometer Pressure\t\t: " + coloradoInfo.get("pressure_in");
			
			System.out.println("\nWeather Conditions:");
			System.out.println("-------------------------------------------------");
			System.out.println(wunderGround);
		}
		catch(IOException e){
			System.out.println("It seems that a network connection is not available, or some other error occured trying to access the provided url. "
					+ "\nURL: " + Url.toString() + "\nError Message: " + e.toString());
                }
                            
                             
                            }
}


