/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hib;

/**
 *
 * @author BULLOJP
 */
import java.net.MalformedURLException;
import java.util.Scanner;
import org.json.JSONException;

public class View {
  
  
	Scanner userInput = new Scanner(System.in);

	// Program constructor
	public View() {
	}

	public static void main(String[] args) throws MalformedURLException, JSONException {
		View view = new View();
		boolean quit = false;
		
		while (!quit) {
			/*
			 * Control of the program will flow through the Main Menu and the
			 * sub menus.
			 */
			quit = view.main();
		}
		System.exit(0);
	}

	/* ************
	 * System Menus 
	 * ************/

	/*
	 * Main Menu
	 */
	private boolean main() throws MalformedURLException, JSONException {
		boolean quit = false;

		while (!quit) {
			Integer selection = null;

			// Print the main menu
			System.out.println();
			System.out.println("Main");
			System.out.println("	1. People Menu");
			System.out.println("	2. JSON Example");
			System.out.println("	3. Quit application");
			System.out.print("Please enter 1, 2, or 3: ");

			// Attempt to read user input
			try {
				selection = Integer.parseInt(userInput.nextLine());
			} catch (NumberFormatException e) {
				
				System.out.println();
				System.out.println("Letters are not permitted. Numbers only!");
				return false;
			}

			switch (selection) {
			case 1:
				// Open Add User Menu
				AddUser();
				break;
			case 2:
				ControllerInsertJSON.doThat();
				
				break;
			case 3:
				// Quit
				System.out.println();
				System.out.println("Quitting!");
				quit = true;
				return quit;
			default:
				//Error Control - Enter a number!
				System.out.println();
				System.out.println("Please enter a number.");
				break;
			}
		}

		return quit;

	}

	/*
	 * User Menu
	 */
	private void AddUser() {
		boolean returnToMain = false;

		while (!returnToMain) {
			Integer selection = null;

			// Print menu
			System.out.println();
			System.out.println("User Management");
			System.out.println("	1. Add User");
			System.out.println("	2. List All Users");
			System.out.println("	3. Return to Main Menu");
			System.out.print("Please enter your selection (1-6): ");

			// Attempt to read user input
			try {
				selection = Integer.parseInt(userInput.nextLine());
			} catch (NumberFormatException e) {
				// Don't do anything. It will fall to the default case.
			}

			switch (selection) {
			case 1:
				// Call the addUser method, then return to the User menu
				ControllerInsertJSON.AddUser();
				break;
			case 2:
				// Call the listWeatherStats method, then return to the User menu
			//System.out.println("Nothing to see here");
                                 ControllerInsertJSON.listWeatherStats();
				break;
			case 3:
				// Return to the Main Menu
				returnToMain = true;
				break;
			default:
				// A number other than 1-3 was entered.
				// Prompt for input again.
				System.out.println();
				System.out.println("Enter a number!.");
				break;
			}
                        
                }
                
                
                }
}
		

	