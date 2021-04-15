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
	static String text;
	static int num;
	static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu() {
		// Print the main menu of the game
		System.out.println("Select an option");
		System.out.println("1. Add a new player");
		System.out.println("2. Print a player's score");
		System.out.println("3. Print all players scores");
		System.out.println("4. Exit");
		
		// Used to choose an option from the menu
		System.out.print("Enter an option: ");
		text = sc.next();
	}
	
	public static void addPlayer(){
		System.out.print("Insert a name: ");
		text = sc.next();
		System.out.print("Insert score: ");
		num = sc.nextInt();
	}

	public static void printPlayerScore() {
		System.out.println("Insert a player name");
		text = sc.next();
	}
}
