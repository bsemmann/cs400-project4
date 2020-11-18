CS400 Project Four Proposal
TEAM: FF TEAM FLIPGRID: http://flipgrid.com/cs400ff
TA: Abhay TA EMAIL: abhay.kumar@wisc.edu
TEAM EMAILS: 1. bbreddy@wisc.edu 2. mwhurless@wisc.edu 3. salla@wisc.edu 4. tupitza@wisc.edu 5. bsemmann@wisc.edu 6. kgring@wisc.edu  



Project Title: US Election Map

Brief Project Description:
  We intend to create an interactive US map that displays the winner in a particular state when clicked on that state. The state changes its color to either red or blue based on the winner in that state.

Four Chosen Requirements that this Project Fulfills:

<Hashtable>: To store the state and the winner in terms of key value pairs

<CSS/HTML>: HTML to make webpage and CSS to beautify it

<Javascript>: To make the map more interactive

<CSV File>: To input the data



Data Wranglers: Adam Tupitza  

Application Data:
Data from a CSV file will be cleaned and then loaded into a hashtable. The loaded application data will consist of 56 key-value pairs: one for each of the 50 states, one for the District of Columbia, and five representing congressional districts in Maine and Nebraska. The value section of the pairs will store pertinent 2020 presidential election information.

Data Format:
The data will be stored in a hashtable. The keys will be the String name of the state or district (congressional district key format: “Maine-1”, “Nebraska-3”, etc.). The value will be an ArrayList of Strings containing the following information at the following indexes: Index 0- name of the winner of the state/district’s presidential electoral votes. Index 1- number of electoral votes of the district. Index 2- percentage of votes in that state/district that the winner of that particular state/district received. Index 3- percentage of votes in the state/district that the second place finisher of that particular state/district received.



Back End Developer: Bhuvanesh Bathala Brian Semmann 

Data Processing:
The back end code will provide methods that will retrieve and set new data for the hashtable data. These methods will be able to be called using the html file in order to retrieve data to be shown on the webpage.

Front End Interface:
<define the Java interface by listing the specific method signatures that exposes this functionality to the front end of your application>
getState(); (the required state result)
getWinner(); (the winner in that state)


Front End Developer: Mason Hurless Kenneth Ring 

User Commands:
Our application will allow the user to click on different buttons, one for each state, which will open more information. We will also “beautify” the webpage by adding colors, images for each state, and other things to make it more user friendly.

Error Messages:
Our application may call the wrong input for the wrong button or may display the wrong color for the wrong button. So we will do our best to implement safe guards for that.



Test Engineer: Sriram Alla  

Test Descriptions:
I will test the code that we have completed, making sure that the output is coming as we expect it to and that there aren’t any bugs in our completed version. I will make use of jUnit test cases that we taught to test the correctness of the code written by my teammates.



Additional Responsibilities and Notes:
I will try to incorporate regex wherever I can to test the correctness of the output that our code generates


Schedule:

Due 11/24
Data Wranglers
Obtain and prepare/clean a file of CSV election data.
Back End Developers
Complete the getState and getWinner methods
Front End Developers
Get a basic webpage up and running using the methods taught to us in recent lectures.
Test Engineers
Make a generic testing suite using jUnit for the test cases.


Due 12/01
Data Wranglers
Complete the process of loading the CSV-formatted data into a hashtable.
Back End Developers
Complete any other required methods if possible
Front End Developers
Implement the backend methods to fully complete our program.
Test Engineers
Incorporate the methods written by my team members into my test suite to verity that they are producing the required output. 



Due 12/08
Data Wranglers
Make any tweaks or alterations to the structure of the loaded data if a necessary change is identified.
Back End Developers
We expect the entire code to be completed by this deadline
Front End Developers
Any minor fixes or bugs will be resolved at this time.
Test Engineers
Final testing of all the completed code will be done at this time.

Signatures:

Bhuvanesh Reddy Bathala____               ___Kenneth Ring___

_Brian Semmann____________             ____Adam Tupitza____

____Sriram Alla____________             __________________________


End of Proposal

