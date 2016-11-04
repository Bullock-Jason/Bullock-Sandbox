/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HLC;
import java.util.*;

/**
 *
 * @author BULLOJP
 */
public class Sets {

   public static void main(String[] args) {
      // Create the sorted set
        Set dvdSet = new TreeSet(); 
       
        // Add elements to the set
        dvdSet.add("A The Magnificent Seven");
        dvdSet.add("F The Amazing Spiderman 2");
        dvdSet.add("Z The Avengers");
        dvdSet.add("W Singin' in the Rain");
        dvdSet.add("R WALL-E");
        dvdSet.add("B The Bourne Identity");
        dvdSet.add("B The Bourne Ultimatum");
        dvdSet.add("D The Bourne Supremecy");
        dvdSet.add("C The Bourne Legacy");
        dvdSet.add("G The Bourne Identity");
        dvdSet.add("H The Bourne Ultimatum");
        dvdSet.add("F The Bourne Supremecy");
        dvdSet.add("Y The Bourne Legacy");
        HashSet hs1 = new HashSet();
        hs1.add("A");
//        hs1.add("F");
//        hs1.add("Z");
        hs1.add("W");
     //hs1.add("R");
        hs1.add("B");
     hs1.add("O");
        hs1.add("D");
        hs1.add("C");
        hs1.add("G");
        hs1.add("H");
        hs1.add("F");
     //   hs1.add("Y");
        System.out.println(hs1);
        HashSet hs = new HashSet();
          // add elements to the hash set
          hs.add("B");
          hs.add("A");
          hs.add("D");
          hs.add("E");
          hs.add("C");
          hs.add("F");
          System.out.println(hs);
        

      // Iterating over the elements in the set
     // Iterator iterator = dvdSet.iterator();
     // Iterator iteratorHash = hs1.iterator();
      
      
      
    
//      System.out.println();
//      System.out.println("This will show unique items in the list");
//     //This will print the Set out in alphabetical order because it is a SortedSet
//      while (iterator.hasNext()) {
//         // Get element
//         System.out.println(iterator.next());
//         //System.out.println(iterator.toString());
        
      }
      //This will print the HashSet which removes duplicates
      
//      System.out.println();
//      System.out.println("This prints a hash set whatever that is");
//      while (iteratorHash.hasNext()) {
//         // Get element
//         System.out.println(iteratorHash.next());
//         //System.out.println(iteratorHash.toString());
//        System.out.println();
    //  }
   //}
} 

