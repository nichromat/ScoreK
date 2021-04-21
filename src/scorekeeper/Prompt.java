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
	static final String PROGRAM_VERSION = "1.0";
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
		System.out.print("Enter an option: ");
		text = sc.next();
	}
	
	public static void askForName()	{
		System.out.print("Insert a name: ");
		text = sc.next();
	}
	
	public static void askForNum() {
		try {
		System.out.print("Insert score: ");
		num = sc.nextInt();
		}
		catch (Exception InputMismatchException) {
			
		}

	}
	public static void addPlayer(){
		askForName();
		askForNum();
	}

	public static void printPlayerScore() {
		askForName();
	}
}
