/**
 * This is the main class: The program starts here
 */
package scorekeeper;

/**
 * @author nichromat
 *
 */
public class Program {

	/**
	 * @param args
	 */
	static boolean gameEnded = false;
	// Defines whether the game is ended or not
	
	final static String PROGRAM_VERSION= "1.0"; 
	// Program version
	
	public static void main(String[] args) {
		Game g = new Game();
		
		while(!gameEnded){
			Prompt.cleanTerminal();	// Clean the terminal
			Prompt.mainMenu();		// Prompt the main menu
			Prompt.askForOption();	// Ask user to select an option
			
			switch (Prompt.text1) {
			
			case "1":
				Prompt.cleanTerminal();	// Clean the terminal
				Prompt.askForName(); 	// Ask for a player name
				Prompt.askForNum();		// Ask for a number
				g.secureAddPlayer(Prompt.text1, Prompt.text2);	// Use the input to create a new player
				Prompt.waitForEnter();		// Wait for user to press enter to continue
				break;
			case "2":
				Prompt.cleanTerminal();	// Clean the terminal
				Prompt.askForName();	// Ask for a player name
				g.printPlayerScore(Prompt.text1);	// Use the input to search for a specific player
				Prompt.waitForEnter();	// Wait for user to press enter to continue
				break;
			case "3":
				Prompt.cleanTerminal();	// Clean the terminal
				g.printAllScores();		// Print every existing scores in the game
				Prompt.waitForEnter();	// Wait for user to press enter to continue
				break;
			case "4":
				Prompt.cleanTerminal(); // Clean the terminal
				gameEnded = true;		// End the game
				break;
			default:
				System.out.println("Warning: Option available from 1 to 4");	// Print a warning to the user
			}
		}
		System.out.println("\nScoreK " + PROGRAM_VERSION);	// Print the game version
		System.out.println("Thanks for using ScoreK.");		// Thanks the user to use the program
	}

}
