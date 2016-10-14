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
			// Collection example using Map and Set
			//get list of header fields and a set of the header keys
			System.out.println("\nJava Collection Framework Code Showing Map and Set:");
			Map<String, List<String>> headMap = urlCn.getHeaderFields();
			Set<String> headerField = headMap.keySet();
			TreeMap<String, List<String>> hvTM = new TreeMap<String, List<String>>();
			
			System.out.println("Web Server Header details: ");
			//display all headers and values
			for(String key : headerField) {
				System.out.println("Info: " + key + " Value: " + headMap.get(key));
				// load treeMap
				if(key != null){
					hvTM.put(key, headMap.get(key));
				}
			}
			
			//JAVA COLLECTION EXAMPLE USING TREEMAP
                        //
			System.out.println("\nJava Collection Framework Code Showing TreeMap:");
	        //add key-value pair to TreeMap
	        System.out.println(hvTM);
			
	        //display the contents using an iterator
	        /* Display content using Iterator*/
	        Set set = hvTM.entrySet();
	        Iterator iterator = set.iterator();
	        while(iterator.hasNext()) {
	           Map.Entry mentry = (Map.Entry)iterator.next();
	           System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	           System.out.println(mentry.getValue());
	        }
			
                }
                catch(IOException e){
			System.out.println("There is an error somewhere"
					+ "\nURL: " + Url.toString() + "\nError Message: " + e.toString());
		}
    }
}