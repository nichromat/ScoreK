/**
 * This code will be used for managing the prompt, inputs and outputs during 
 * the execution of the program. 
 */
package scorekeeper;

import java.util.Scanner;

/**
 * @author nichromat
 *
 */
public class Prompt {
	static boolean errorFound = false;
	static String text1; 
	static String text2;
	static Scanner sc = new Scanner(System.in);
	
	/* Prompt message */
	public static void mainMenu() {
		// Print the main menu of the game
		System.out.println("------------------------");
		System.out.println("Select an option");
		System.out.println("1. Add a new player");
		System.out.println("2. Print a player's score");
		System.out.println("3. Print all players scores");
		System.out.println("4. Exit");
	}
	
	/*Basic function that's ask for user input*/
	
	public static void askForOption() {
		// Ask for a numerical option at the main menu
		System.out.print("Enter an option: ");
		text1 = sc.next();
	}
	
	public static void askForName()	{
		// Ask for a name
		System.out.print("Insert a name: ");
		text1 = sc.next();
	}
	
	public static void askForNum() {
		// ask for a number
		System.out.print("Enter a number: ");
		text2 = sc.next();
	}
	
	
	/* Useful functionalities */
	
	public static void cleanTerminal() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
	
	public static void waitForEnter() {
		System.out.println("Press enter to continue...");
		try{
			System.in.read();
			}
		catch(Exception e){	
			e.printStackTrace();
			}
	}
}
