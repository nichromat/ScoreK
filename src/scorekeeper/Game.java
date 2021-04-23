/**
 * This is a model class: It represent the games object structures and behaviours
 */
package scorekeeper;

import java.util.HashMap;


/**
 * @author nichromat
 *
 */
public class Game {
	private HashMap<String, Integer> players; 
	
	/* Constructors */
	
	Game(){
		// Each new game creates a new HashMap of players
		players = new HashMap<String, Integer>();
	}
	
	
	/* Basic functions */
	
	private void addPlayer(String name, int score){
		// Create new player from the given name and score
		players.put(name, score);

	}
	
	public void printPlayerScore(String name){
		// Print the score from the given player name
		System.out.println("Name: " + name + " | " + "Score: " + players.get(name));	

	}
	
	/* Advanced functions */
	
	public void printAllScores() {
		// Print all the scores available
		  for(String name: players.keySet()){
		    printPlayerScore(name);
		  } 
	}
	
	public void secureAddPlayer(String name, String score){
		try {
			addPlayer(name, Integer.parseInt(score));
		}
		catch (NumberFormatException e) {
			System.out.println("Warning: the score you entered is invalid");
		}
	}
	
	
	
}
