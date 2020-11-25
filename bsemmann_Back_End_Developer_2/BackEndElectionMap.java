import java.util.NoSuchElementException;

// --== CS400 File Header Information ==--
// Name: Brian Semmann
// Email: bsemmann@wisc.edu
// Team: FF
// TA: Abhay
// Role: Back End Developer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

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
	 * This constructor creates a new instance of the back end
	 * of the election map and gives the front end developer access
	 * to the get methods that it contains.
	 */
	public BackEndElectionMap() {
		//Create new instance of the data field
	}
	
	
	
	public State getState(String stateName) {
		int hash = stateName.hashCode();
		State toReturn = null; // the state data type to return
		
		if (hash != null ) { // if the hashed value doesn't equal null
			//toReturn = state value at the hashed index;
		} else {
			throw new NoSuchElementException("The state you are looking for does not exist!");
		}
		
		return toReturn;
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
		State state = getState(stateName);
		String winner = null; 
		
		winner = state.getWinner;
		
		return winner;
	}
}
