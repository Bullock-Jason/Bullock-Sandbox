/*
 * To change this license header, choose License Headers in Project Properties. The
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolio;

import java.util.ArrayList;

/**
 *
 * @author BULLOJP
 */
public class collections  {
    
    public static void main(String[] args) { 
        
       
        //Array List Example
        System.out.println("*********ArrayList*********");
        System.out.println("*********Example***********");
        ArrayList<String> rainbow = new ArrayList<String>();
        rainbow.add("Violet");
        rainbow.add("Blue");
        rainbow.add("Green");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Red");
        System.out.println("The first color in the rainbow is: "+rainbow.get(0));
        System.out.println("The second color in the rainbow is: "+rainbow.get(1));
        System.out.println("The third color in the rainbow is: "+rainbow.get(2));
        System.out.println("The fourth color in the rainbow is: "+rainbow.get(3));
        System.out.println("The fifth color in the rainbow is: "+rainbow.get(4));
        System.out.println("The last color in the rainbow is: "+rainbow.get(5));

        
       
           //Substitute a color for another color
            rainbow.remove(4); rainbow.add(4, "Pink");
           
           //print colors in order
            System.out.println(rainbow);
            System.out.println("Notice how the fifth element is " +
                     "now " +rainbow.get(4));
            
     
            
        }
         
    
}
