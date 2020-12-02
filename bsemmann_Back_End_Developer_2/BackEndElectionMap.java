// --== CS400 File Header Information ==--
// Name: Brian Semmann
// Email: bsemmann@wisc.edu
// Team: FF
// TA: Abhay
// Role: Back End Developer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

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
	 * @return
	 */
	public String getWinner(String stateName) {
		int state = getState(stateName);
		String winner = null; 
		
		winner = state.data; //gets the string data & throws a no such element exception
							 //if the state does not exist. Still waiting on hashtable of states
		
		return winner;
	}
}
