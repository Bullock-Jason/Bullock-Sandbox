/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlConnection;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.json.JSONObject;

/**
 *
 * @author BULLOJP
 */
public class urlConnection {
    public static void main(String[] args) throws Exception{
                URL Url = new URL("http://data.colorado.gov/resource/4ykn-tg5h.json?entitystatus=Good%20Standing&principalzipcode=80923");
		
    try{
            HttpURLConnection urlCn = (HttpURLConnection) Url.openConnection();

            //JAVA COLLECTION FRAMEWORK EXAMPLE INCLUDING MAP/SET
            //
            //************************
            // Map and Set code. This took awhile to get right. I referenced tutorialspoint.com for help. 

            //This gets data from the HTTP header and sets keys and such
            System.out.println("\nJava Collection Framework Code Showing Map and Set:");
            Map<String,List<String>> headMap = urlCn.getHeaderFields();
            Set<String> urlHeader = headMap.keySet();


            System.out.println("Web Server Header details: ");
            //show web server details from HTTP header.
            //theKey is the value that it gets from the HTTP header.
            for(String theKey : urlHeader) {
                    System.out.println("Info: "+theKey+" Value: "+ headMap.get(theKey));

            }

		// Next thing to do is to integrate this with TreeMap but I don't have it done yet.
	     	
                }
                catch(IOException e){
			System.out.println("Some Error Somewhere is breaking your code. Figure it out! The site probably can't be reached right now"
					+ "\nURL: " + Url.toString() + "\nError Message: " + e.toString());
		}
    }
}