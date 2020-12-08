// --== CS400 File Header Information ==--
// Name: Sriram Alla
// Email: salla@wisc.edu
// Team: Team FF
// Role: Test Engineer
// TA: Abhay Kumar
// Lecturer: Gary Dahl
// Notes to Grader: N/A

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class TestApplication {

  ElectionBackEnd obj = new ElectionBackEnd(); // Object of BackEnd class
  HashTableMap<String, ArrayList<String>> map = new HashTableMap<>(); // HashTableMap containing all
                                                                      // the States and their
                                                                      // election results
  ArrayList<String> list = new ArrayList<>(); // ArrayList to store the election result of a
                                              // particular state

  @Test
  /**
   * Test method to test the getWinnerName() method.
   * 
   */

  void testWinnerName() {
    
    if (!(obj.getWinnerName("Alabama").trim().equals("Donald Trump")))
      fail("Not yet implemented");
  }

  @Test
  /**
   * Test method to test the getElectoralVotes() method.
   * 
   */

  void testElectoralVotes() {
    list.add("11");
    list.add("Joe Biden");
    list.add("49.39");
    list.add("49.09");
    map.put("Arizona", list);
    if (!(obj.getElectoralVotes("Arizona").trim().equals("11")))
      fail("Not yet implemented");
  }

  @Test
  /**
   * Test method to test the getWinnerVotePercent() method.
   * 
   */

  void testWinnerVotePercent() {
    list.add("55");
    list.add("Joe Biden");
    list.add("63.59");
    list.add("34.25");
    map.put("California", list);
    if (!(obj.getWinnerVotePercent("California").trim().equals("63.59")))
      fail("Not yet implemented");
  }

  @Test
  /**
   * Test method to test the getLoserVotePercent() method.
   * 
   */

  void testLoserVotePercent() {
    list.add("29");
    list.add("Donald Trump");
    list.add("51.22");
    list.add("47.87");
    map.put("Florida", list);
    if (!(obj.getLoserVotePercent("Alabama").trim().equals("36.68")))
      fail("Not yet implemented");
  }

  @Test
  /**
   * Test method to test the getContainsKey() method.
   * 
   */

  void testContainsKey() {
    list.add("9");
    list.add("Donald Trump");
    list.add("62.23");
    list.add("36.68");
    map.put("Nevada", list);
    if (!obj.getContainsKey("Nevada"))
      fail("Not yet implemented");
  }
}
