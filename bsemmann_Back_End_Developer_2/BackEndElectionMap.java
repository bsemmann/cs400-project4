// --== CS400 File Header Information ==--
// Name: Brian Semmann
// Email: bsemmann@wisc.edu
// Team: FF
// TA: Abhay
// Role: Back End Developer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * The class will provide the back end code for the election map given
 * results from the 2020 presidential election. It will provide methods that will retrieve 
 * and set new data for the hashtable data. These methods will be 
 * able to be called using the html file in order to retrieve data 
 * to be shown on the webpage.
 * 
 * @author Brian Semmann
 *
 */
public class BackEndElectionMap {
	
	HashTableMap map = new HashTableMap();
	
	/**
	   * This method returns the hash value of the state
	   * 
	   * @param state in which winner is requested
	   * @return the winner
	   */
	public int getState(String stateName) {
		
		int hashValue = stateName.hashCode(); //uses the hash code method to get value 
		
		return hashValue; //return the location of state in the hash table
	}
	
	
	/**
	 * This method takes a parameter of one of the fifty states in
	 * the United States and (given that is a real state) returns the
	 * winner of the election in that specific state.
	 * 
	 * @param state the state you want to find the winner of 
	 * @return name of winner
	 */
	public String getWinnerName(String stateName) {
		int state = getState(stateName);
		ArrayList<String> canidate = (ArrayList<String>) map.get(state);
		String winner = null; 
		
		winner = canidate.get(0); 
		
		return winner;
	}
	
	/**
	   * Checks if the state is in the hash table and prints out the
	   * boolean result of that check.
	   * @param state to be checked
	   */
	  public void getContainsKey(String state) {
	    boolean result = map.containsKey(state);
	    System.out.println(result);
	  }
	  
	  /**
	   * returns the number of electoral votes that the given state has
	   * 
	   * @param stateName
	   * @return number of electoral votes
	   */
	  public String getElectoralVotes(String stateName) {
		  String elcVotes = null;
		  ArrayList<String> canidate = (ArrayList<String>) map.get(getState(stateName));
			
		  elcVotes = canidate.get(1); 
		  
		  return elcVotes;
	  }
	  
	  /**
	   * Returns the percentage of votes that the winner of the given
	   * state recieved from that state or district
	   * 
	   * @param stateName
	   * @return win percentage
	   */
	  public String getWinnerPercent(String stateName) {
		  String winPercentage = null;
		  ArrayList<String> canidate = (ArrayList<String>) map.get(getState(stateName));
			
		  winPercentage = canidate.get(2); 
		  
		  return winPercentage;
	  }
	  
	  /**
	   * Returns the percentage of votes that the loser of the given
	   * state recieved from that state or district
	   * 
	   * @param stateName
	   * @return percentage of votes for loser
	   */
	  public String getLoserPercent(String stateName) {
		  String loserVotePercentage = null;
		  ArrayList<String> canidate = (ArrayList<String>) map.get(getState(stateName));
			
		  loserVotePercentage = canidate.get(3); 
		  
		  return loserVotePercentage;
	  }
	  
	  
}
