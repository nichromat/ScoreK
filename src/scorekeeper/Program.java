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
	
	public static void main(String[] args) {
		Game g = new Game();
		
		while(!gameEnded){
			Prompt.mainMenu();
			
			if(Prompt.text.equals("1")){
				Prompt.addPlayer();
				g.addPlayer(Prompt.text, Prompt.num);
				
			}
			
			if (Prompt.text.equals("2")) {
				Prompt.printPlayerScore();
				g.printPlayerScore(Prompt.text);
			}
			
			if (Prompt.text.equals("3")) {
				g.printAllScores();
			}
			
			
			if (Prompt.text.equals("4")) {
				gameEnded = true;
			}
		}
		
		

	}

}
