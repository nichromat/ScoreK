/**
 * 
 */
package scorekeeper;

import java.util.Scanner;

/**
 * @author nichromat
 *
 */
public class Prompt {
	static boolean errorFound = false;
	static String text;
	static int num;
	static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu() {
		// Print the main menu of the game
		System.out.println("------------------------");
		System.out.println("Select an option");
		System.out.println("1. Add a new player");
		System.out.println("2. Print a player's score");
		System.out.println("3. Print all players scores");
		System.out.println("4. Exit");
		
		// Used to choose an option from the menu
	}
	
	public static void askForOption() {
		// Ask for a numerical option at the main menu
		System.out.print("Enter an option: ");
		text = sc.next();
	}
	
	public static void askForName()	{
		// Ask for a name
		System.out.print("Insert a name: ");
		text = sc.next();
	}
	
	public static void askForNum() {
		// ask for a number
		try {
		System.out.print("Insert score: ");
		text = sc.next();
		num = Integer.parseInt(text);
		}
		catch (Exception InputMismatchException) {
			errorFound = true;
			
		}

	}
	public static void addPlayer(){
		askForName();
		askForNum();
	}

	public static void printPlayerScore() {
		askForName();
	}
	
	public static void restoreError() {
		errorFound = false;
	}

}
