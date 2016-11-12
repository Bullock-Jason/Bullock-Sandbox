/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author BULLOJP
 */
public class CollectionSandbox {
    public static void main(String[] args) {

                System.out.println("HashMap Example");
                        // A HashMap is an object that matches keys to values.
                HashMap<String, String> Hmap1 = new HashMap<>();
		Hmap1.put("Example One", "One");
		Hmap1.put("Example Two", "Two");
		System.out.println("Example One is "+Hmap1.get("Example One"));
		System.out.println("Example Two is "+Hmap1.get("Example Two"));

		
		// Substituting Something Else for Example One
		System.out.println("Example One is "+Hmap1.get("Example One"));
		Hmap1.put("Example One", "Three");
		System.out.println("Example One is now "+Hmap1.get("Example One"));
	
                //Array List Example
		System.out.println("*********ArrayList*********");
		System.out.println("***************************");
		ArrayList<String> rainbow = new ArrayList<String>();
		rainbow.add("Violet");
		rainbow.add("Blue");
                rainbow.add("Green");
                rainbow.add("Yellow");
                rainbow.add("Orange");
                rainbow.add("Red");
		System.out.println("The first color in the rainbow is: "+rainbow.get(0));
		System.out.println("The second thing in rainbow is: "+rainbow.get(1));
                System.out.println("The third thing in rainbow is: "+rainbow.get(2));
                System.out.println("The fourth thing in rainbow is: "+rainbow.get(2));
                System.out.println("The fifth thing in rainbow is: "+rainbow.get(4));
		
		// Nothing there
		System.out.println("There's nothing after those two. Calling a non-existent index...");
		try {
			System.out.println(rainbow.get(2));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Got an IndexOutOfBounds Exception.");
		}
		System.out.println("Continuing...");
		
		// Adding multiple copies of Meat Lover's Pizza
		System.out.println("Adding 10 Meat Lover's Pizzas");
		for(int i=0;i<10;i++) {
			rainbow.add("Meat Lover's Pizza");
		}
		//Printing the pizzas
		System.out.println("Printing the pizzas (if only it was that simple...)");
		for(String pizza : rainbow) {
			System.out.println(pizza);
		}
		
		// Insert null into the middle of the array list
		System.out.println("Let's insert a null into the middle of the array!");
		rainbow.add(5, null);
		System.out.println("Printing the pizzas (if only it was that simple...)");
		for(String pizza : rainbow) {
			System.out.println(pizza);
		}
		
		/*
		 * HashSet
		 * Sets cannot contain duplicate elements.
		 * Sets do not have a get method.
		 * Sets are unordered.
		 */
		System.out.println();
		System.out.println("***************************");
		System.out.println("**********HashSet**********");
		System.out.println("***************************");
		HashSet<String> aHashSet = new HashSet<String>();
		aHashSet.add("Spicy Tuna Roll");
		aHashSet.add("New York Crunch Roll");
		System.out.println(aHashSet.toString());
		
		// Add a duplicate element
		System.out.println("Adding a duplicate element...");
		aHashSet.add("New York Crunch Roll");
		System.out.println(aHashSet.toString());
		System.out.println("Notice that the extra element was not added.");
		
		/*
		 * TreeMap
		 * A sorted tree of values.
		 */
		System.out.println();
		System.out.println("***************************");
		System.out.println("**********TreeMap**********");
		System.out.println("***************************");
		TreeMap<String, String> aTreeMap = new TreeMap<String, String>();
		aTreeMap.put("Key 1", "Grape");
		aTreeMap.put("Key 2", "Apple");
		System.out.println("Key 1 is "+aTreeMap.get("Key 1"));
		System.out.println("Key 2 is "+aTreeMap.get("Key 2"));
		
		// Print something that doesn't exit
		System.out.println("Print Key 3 (doesn't exist)");
		System.out.println("Key 3 is "+aTreeMap.get("Key 3"));
		
		// Try to duplicate a key
		aTreeMap.put("Key 1", "Tomato");
		System.out.println("Key 1 is now "+aTreeMap.get("Key 1"));
		
		// Null key?
		try {
			aTreeMap.put(null, "Null Key");
		} catch (NullPointerException e) {
			System.out.println("Can't have a null key in a map.");
		}

	}
 
}
