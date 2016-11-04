/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HLC;

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *
 * @author BULLOJP
 */
public class urlConnection 
 {
  public static void main(String[] args)
  {
    String output  = getUrlContents("http://www.d11.org/");
    System.out.println(output);

  }

  private static String getUrlContents(String theUrl)
  {
    StringBuilder content = new StringBuilder();
  

   
    
  
   
    try
    {
     // Call the Java.net.url class
              URL url = new URL(theUrl);
     // Call the java.net.URLConnection class
              URLConnection urlConnection = url.openConnection();
     // Call java.io.BufferedReader and InputStreamReader      
              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
              String line;
              
              while ((line = bufferedReader.readLine()) != null)              {
                  content.append(line + "\n");
              }
              bufferedReader.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return content.toString();
  }
}