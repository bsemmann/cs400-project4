// --== CS400 File Header Information ==--
// Name: <Bhuvanesh Reddy Bathala>
// Email: <bbreddy@wisc.edu email address>
// Team: <your team name: ff>
// Role: <>Back End Developer 1>
// TA: <Abhay Kumar>
// Lecturer: <Gary Dhal>
// Notes to Grader: <optional extra notes>

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class ElectionBackEnd {
  USElectionData map = new USElectionData();
  HashTableMap<String, ArrayList<String>> table = map.getDataHashTable();//to get required hashtable map
                                                                    //from USElectionData class
  
  ArrayList<String> result = new ArrayList<>();// creating an array list of type string
  
 
 
 /**
    * Check if the required state is present
    * @param state to be checked
    * @return true if state is present else false
    */
   public boolean getContainsKey(String state) {
     boolean result = table.containsKey(state);//calling containsKey method to check is required 
                                               //state is present
     return result;
   }
   
   
   /**
   * Method to find out the number of ElectoralVotes won in a particular state
   * @param state in which you want to find the Electoral Votes
   * @return the electoral votes in that particular state
   */
  public String getElectoralVotes(String state) {
     result = table.get(state);//storing the data related to a state in a array list called result
     String ElectoralVotes = result.get(0);//getting the first of electoral votes from the list
     
     return ElectoralVotes ;
   }
   
   /**
    * Method to check the winner in a particular state
    * 
    * @param state where you want to get the name of winner
    * @return name of winner
    */
   public String getWinnerName(String state) {
     
     result = table.get(state);
     String winner = result.get(1); // getting name of winner from array list and storing it
     
     return winner;
   }
   
   /**
    * Method to check the winner vote percentage in a particular state
    * 
    * @param state where you want to find the winnerVotePercentage
    * @return the winner vote percentage
    */
   public String getWinnerVotePercent(String state) {
     result = table.get(state);
     String winnerVotePercentage = result.get(2);// getting winner percentage from array list
     
     return winnerVotePercentage ;
   }
   
   /**
    * Method to check the loser vote percentage
    * 
    * @param state where you want to check the loser vote percentage
    * @return the loser vote percentage.
    */
   public String getLoserVotePercent(String state) {
     result = table.get(state);
     String loserVotePercentage = result.get(3);//getting loser percentage from array list
     
    
     return loserVotePercentage;
   }
   
   
}
