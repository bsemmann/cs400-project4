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
	
	USElectionData map = new USElectionData();
	HashTableMap<String, ArrayList<String>> hashTable = map.getDataHashTable();
	
	ArrayList<String> candidate = new ArrayList<>();
	
	/**
	   * Checks if the state is in the hash table and prints out the
	   * boolean result of that check.
	   * @param state to be checked
	   */
	  public boolean getContainsKey(String state) {
	    boolean result = hashTable.containsKey(state); 
	    return result;
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
		 
	     candidate = hashTable.get(stateName); //get candidate from hashtable
	     String winner = candidate.get(1); //get data from candidate
	     	     		
		 return winner;
	}
	  
	  /**
	   * returns the number of electoral votes that the given state has
	   * 
	   * @param stateName
	   * @return number of electoral votes
	   */
	  public String getElectoralVotes(String stateName) {
		  
		  candidate = hashTable.get(stateName); //get candidate from hashtable
		  String electoralVotes = candidate.get(0); //get data from candidate
		  
		  return electoralVotes;
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
		  candidate = hashTable.get(stateName); //get candidate from hashtable
	
		  winPercentage = candidate.get(2); //get data from candidate
		  
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
		  candidate = hashTable.get(stateName); //get candidate from hashtable
			
		  loserVotePercentage = candidate.get(3); //get data from candidate
		  
		  return loserVotePercentage;
	  }
	  
	  
}
