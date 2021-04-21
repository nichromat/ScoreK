/**
 * 
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
			Prompt.mainMenu();
			Prompt.askForOption();
			
			switch (Prompt.text) {
			case "1": 
				Prompt.addPlayer(); 
				g.addPlayer(Prompt.text, Prompt.num);
				break;
			case "2": 
				Prompt.printPlayerScore();
				g.printPlayerScore(Prompt.text);
				break;
			case "3": 
				g.printAllScores();
				break;
			case "4": 
				gameEnded = true;
				break;
			default:
				System.out.println("Option not valid: Option available from 1 to 4");
			}
		}
		System.out.println("\nScoreK " + PROGRAM_VERSION);
		System.out.println("Thanks for using ScoreK.");
	}

}
