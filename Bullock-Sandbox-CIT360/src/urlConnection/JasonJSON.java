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
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


/**
 *
 * @author BULLOJP
 */
public class JasonJSON {
        public static void main(String[] args) throws Exception{
		//URL Url = new URL("http://api.wunderground.com/api/22b4347c464f868e/conditions/q/Utah/Alpine.json");
              //  URL Url = new URL("http://api.wunderground.com/api/22b4347c464f868e/conditions/q/Utah/Alpine.json");
              //  URL Url = new URL("http://api.wunderground.com/api/22b4347c464f868e/conditions/q/Utah/Alpine.json");
                URL Url = new URL("http://api.usno.navy.mil/eclipses/solar?year=2024");
		
		try{
			HttpURLConnection urlCn = (HttpURLConnection) Url.openConnection();
    //read stream
			InputStream in = urlCn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder result = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null) {
			    result.append(line);
			}
			
			//Process output json object
			JSONObject json = new JSONObject(result.toString());
			JSONObject currObs = (JSONObject) json.get("current_observation");

            String theOutput = "Weather\t\t\t: " + currObs.get("weather")
                    + "\nTemperature\t\t: " + currObs.get("temperature_string")
                    + "\nWindchill\t\t: " + currObs.get("feelslike_string")
                    + "\nRelative Humidity\t: " + currObs.get("blative_humidity")
                    + "\nWind\t\t\t: " + currObs.get("wind_string")
                    + "\nPressure\t\t: " + currObs.get("pressure_mb");
			
			System.out.println("\nWeather Conditions:");
			System.out.println("-------------------------------------------------");
			System.out.println(theOutput);
		}
		catch(IOException e){
			System.out.println("It seems that a network connection is not available, or some other error occured trying to access the provided url. "
					+ "\nURL: " + Url.toString() + "\nError Message: " + e.toString());
		}
	}
}