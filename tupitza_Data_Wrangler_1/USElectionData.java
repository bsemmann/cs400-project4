// --== CS400 File Header Information ==--
// Name: Adam Tupitza
// Email: tupitza@wisc.edu
// Team: FF
// Role: Data Wrangler 1
// TA: Abhay Kumar
// Lecturer: Gary Dahl
// Notes to Grader: n/a
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class initializes the data for the 2020 US Presidential Election Map application.
 * 
 * @author Adam Tupitza
 *
 */
public class USElectionData {
  private HashTableMap<String, ArrayList<String>> dataHashTable; // stores 2020 Pres. Election data
  private ArrayList<String> keysList = new ArrayList<String>(); // list of Electoral College states/districts

  /**
   * Constructor for a USElectionData object. This constructor creates a Hash Table from a CSV
   * of 2020 Presidential Election data and an ArrayList of the names of states/districts that award
   * Electoral College votes.
   * 
   */
  public USElectionData() {
    dataHashTable = new HashTableMap<String, ArrayList<String>>();
    final String CSV_FILENAME = "2020_election_data.csv";

    try {
      File electionData = new File(CSV_FILENAME);
      Scanner scnr = new Scanner(electionData);

      scnr.nextLine(); // consume the CSV header

      // store info from each state/district into the hashtable, one line at a time
      while (scnr.hasNextLine()) {
        String[] currentLine = parseLine(scnr.nextLine());
        String stateName = currentLine[0];
        keysList.add(stateName); // add the current state/district to the list of names
        ArrayList<String> stateInfo =
            new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(currentLine, 1, 5)));
        dataHashTable.put(stateName, stateInfo); // place the state data in the hash table
      }
      scnr.close();
    } catch (FileNotFoundException fnfe) {
      System.out.println(CSV_FILENAME + " could not be found.");
    }
  }

  /**
   * Getter method to obtain the hashtable created by this object.
   * 
   * @return the hashtable containing 2020 Presidential Election data
   */
  public HashTableMap<String, ArrayList<String>> getDataHashTable() {
    return dataHashTable;
  }
  
  /**
   * Getter method to obtain the ArrayList containing the String names of all states and districts
   * that award Electoral College votes.
   * 
   * @return ArrayList of 56 state/district Strings
   */
  public ArrayList<String> getHashTableKeys() {
    return keysList;
  }

  /**
   * Private helper method to parse a single CSV-formatted line of text into a String array.
   * 
   * @param lineToParse a CSV-formatted String of text
   * @return a String array of each individual value encoded in the line of text
   */
  private static String[] parseLine(String lineToParse) {
    String[] fieldValues = new String[5]; // 5 values on each line
    String currentValue = "";
    int currentCell = 0;

    // traverse through the line of text, one character at a time
    for (int i = 0; i < lineToParse.length(); i++) {

      if (lineToParse.charAt(i) != ',') { // not a comma, so add char to currentValue
        currentValue += lineToParse.charAt(i);
      } else { // char is a comma, so add preceding value to the array
        fieldValues[currentCell] = currentValue;
        currentCell += 1;
        currentValue = "";
      }
      
      // end of line reached, add preceding value to the array
      if (i == (lineToParse.length() - 1)) {
        fieldValues[currentCell] = currentValue;
      }      
    }
    return fieldValues;
  }
}
