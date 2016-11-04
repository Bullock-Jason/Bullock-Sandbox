/*
 * To change this license header, choose License Headers in Project Properties. The
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HLC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author BULLOJP
 */
public class collections  {
    
    public static void main(String[] args) { 
        List colorList = new LinkedList();
        colorList.add("Voilet");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("Puke Green");
        colorList.add("Red");
        colorList.add("Infrared");
        colorList.add("Clear");
        System.out.println("This is a LinkedList");
        System.out.println(colorList);
       //Array List Example
        System.out.println("*********ArrayList*********");
        System.out.println("*********Example***********");
        ArrayList<String> rainbow = new ArrayList<>();
        ArrayList<String> backupList = new ArrayList<>();
        rainbow.add("Violet");
        rainbow.add("Blue");
        rainbow.add("Green");
        rainbow.add("Orange");
        rainbow.add("Puke Green");
        rainbow.add("Red");
        System.out.println("The first color in the rainbow is: "+rainbow.get(0));
        System.out.println("The second color in the rainbow is: "+rainbow.get(1));
        System.out.println("The third color in the rainbow is: "+rainbow.get(2));
        System.out.println("The fourth color in the rainbow is: "+rainbow.get(3));
        System.out.println("The fifth color in the rainbow is: "+rainbow.get(4));
        System.out.println("The last color in the rainbow is: "+rainbow.get(5));

        Iterator newList = colorList.iterator();
        System.out.println("Iterated List");
        System.out.println(newList);
        //Iteration means to take each item in the list and do something with it
        
        for (int i=0; i < rainbow.size(); i++) {
            Object obj = rainbow.get(i);
            backupList.add((String) obj);
        }
        System.out.println();
        System.out.println("\t" + backupList);
        
        for (int j=0; j < backupList.size(); j++) {
              Object obj = backupList.get(j);
              System.out.println(obj);
     
        }
        
        System.out.println("We substitute " + rainbow.get(4) + " for Yellow");
       
           //Substitute a color for another color by inserting the color into the
           //index for 4
           
            rainbow.remove(4); rainbow.add(4, "Yellow");
                    System.out.println(rainbow); 
           //print colors in order

            System.out.println("Notice how the fifth element is " +
                     "now " +rainbow.get(4));
            
     //to remote all iterations of "Yellow"  and print the line
     
            System.out.println("We don't like yellow, so we want to remove it");
                
   
     for (int i=0; i < rainbow.size(); i++) {
         Object obj = rainbow.get(i);
         if (obj == "Yellow") {
             boolean remove = rainbow.remove("Yellow");
           

                  System.out.println(rainbow); 
              System.out.println("This will change index numbers of your list " +
                     ", so be careful. Notice how Index 4 (element 5)  used to be Yellow" +
                    " but now it is "+rainbow.get(4));
                        }
          
          
     }
     
     
   
            
        }
    
}
         
    

