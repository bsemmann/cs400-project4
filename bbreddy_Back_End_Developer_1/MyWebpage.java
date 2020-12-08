// --== CS400 File Header Information ==--
// Name: Kenneth Ring
// Email: kgring@wisc.edu
// Team: FF
// Role: Test Engineer 2
// TA: Abhay Kumar
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
public class MyWebpage {
        public static void main(String[] args) {
            ElectionBackEnd obj = new ElectionBackEnd(); //creates an ElectionBackEnd object so I can use the methods
                System.out.println("<html><head><title>2020 Election Results</title><style>"); //start the webpage with the title "2020 Election Results"
                System.out.println("body{background-color: AliceBlue;padding-bottom: 50px;}"); //sets the light blue color of the webpage and the padding at the bottom
                System.out.println("h1{color: DodgerBlue;text-align: center;font-size: 100px;font-family: Verdana;}"); //sets the blue color, spacing, and size of the header
                System.out.println(".button{font-size: 16px;background-color: Dimgray;color: white;border: none;text-align: center;width: 120px;height: 50px;}"); //style information for button
                System.out.println(".blue:hover{background-color: DodgerBlue;}"); //if a blue class button is hovered it will turn blue
                System.out.println(".red:hover{background-color: FireBrick;}"); //if a red class button is hovered it will turn red
                System.out.println(".red:active{background-color: FireBrick;}");
                System.out.println(".blue:active{background-color: DodgerBlue;}");
                System.out.println("table{margin-left: auto;margin-right: auto;}"); //sets it so the table is centered
                System.out.println("p{color: DodgerBlue;font-size: 30px;text-align: center;}"); //sets the color, size, and spacing of the normal text
                System.out.println(".center{display: block;margin-left: auto;margin-right: auto;width: 50%;}"); //creates the center class which sets things in the center of the page
                System.out.println(".dropdown{position: relative;display: inline-block;}"); //creates the dropdown class
                //creates the dropdown content class
                System.out.println(".dropdown-content {display: none;position: absolute;background-color: #f1f1f1;min-width: 160px;box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);z-index: 1;}");
                System.out.println(".dropdown-content a {color: black;padding: 12px 16px;text-decoration: none;display: block;}"); //creates the dropdown content class
                System.out.println(".dropdown:hover .dropdown-content {display: block;}"); //if hovered, a dropdown class button will display dropdown conten
                System.out.println("</style></head><body>"); //closes out the style and head and opens the body

                System.out.println("<h1>2020 Election Results</h1>"); //header that reads "2020 Election Results"
                //image of the 2020 election map
                System.out.println("<img src = \"https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/ElectoralCollege2020_with_results.svg/1200px-ElectoralCollege2020_with_results.svg.png\" class=\"center\">");
                System.out.println("<p>Hover over any of the buttons below to view the election results from that state or district!</p>"); //instructional text
                System.out.println("<p>Click on them to learn more about them!</p>"); //more instructional text
                
                //creates a table, this table will be made up of dropdown class buttons, each representing a state or district
                System.out.println("<table><tr>");
                //The following is true for all buttons: The button is a dropdown class button meaning when hovered over it will display its unique dropdown content. When clicked on it will direct to a wikipedia
                //page of that state or district using javascript. The dropdown content has been aquired using the ElectionBackEnd methods. They are, from top to bottom: Name of who won that state or district,
                //the number of electoral votes in that state or district. the percent of the vote the winner received, and the percent of the vote the second place canidate received
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Alabama';\">Alabama</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Alabama")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Alabama")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Alabama")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Alabama")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Alaska';\">Alaska</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Alaska")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Alaska")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Alaska")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Alaska")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Arizona';\">Arizona</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Arizona")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Arizona")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Arizona")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Arizona")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Arkansas';\">Arkansas</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Arkansas")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Arkansas")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Arkansas")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Arkansas")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/California';\">California</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("California")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("California")+"</a><a>Winner %: "+obj.getWinnerVotePercent("California")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("California")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Colorado';\">Colorado</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Colorado")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Colorado")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Colorado")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Colorado")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Connecticut';\">Connecticut</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Connecticut")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Connecticut")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Connecticut")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Connecticut")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Delaware';\">Delaware</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Delaware")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Delaware")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Delaware")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Delaware")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Florida';\">Florida</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Florida")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Florida")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Florida")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Florida")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Georgia_(U.S._state)';\">Georgia</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Georgia")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Georgia")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Georgia")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Georgia")+
                    "</div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Hawaii';\">Hawaii</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Hawaii")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Hawaii")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Hawaii")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Hawaii")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Idaho';\">Idaho</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Idaho")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Idaho")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Idaho")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Idaho")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Illinois';\">Illinois</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Illinois")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Illinois")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Illinois")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Illinois")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Indiana';\">Indiana</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Indiana")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Indiana")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Indiana")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Indiana")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Iowa';\">Iowa</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Iowa")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Iowa")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Iowa")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Iowa")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Kansas';\">Kansas</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Kansas")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Kansas")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Kansas")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Kansas")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Kentucky';\">Kentucky</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Kentucky")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Kentucky")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Kentucky")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Kentucky")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Louisiana';\">Louisiana</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Louisiana")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Louisiana")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Louisiana")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Louisiana")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maine';\">Maine-1</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Maine")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Maine")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Maine")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Maine")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maine';\">Maine-2</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Maine-1")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Maine-1")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Maine-1")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Maine-1")+
                    "</div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maine';\">Maine-3</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Maine-2")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Maine-2")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Maine-2")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Maine-2")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maryland';\">Maryland</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Maryland")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Maryland")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Maryland")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Maryland")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Massachusetts';\">Massachusetts</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Massachusetts")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Massachusetts")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Massachusetts")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Massachusetts")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Michigan';\">Michigan</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Michigan")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Michigan")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Michigan")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Michigan")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Minnesota';\">Minnesota</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Minnesota")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Minnesota")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Minnesota")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Minnesota")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Mississippi';\">Mississippi</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Mississippi")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Mississippi")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Mississippi")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Mississippi")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Missouri';\">Missouri</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Missouri")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Missouri")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Missouri")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Missouri")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Montana';\">Montana</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Montana")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Montana")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Montana")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Montana")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-1</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Nebraska")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Nebraska")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Nebraska")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Nebraska")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-2</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Nebraska-1")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Nebraska-1")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Nebraska-1")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Nebraska-1")+
                    "</div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-3</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Nebraska-2")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Nebraska-2")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Nebraska-2")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Nebraska-2")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-4</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Nebraska-3")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Nebraska-3")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Nebraska-3")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Nebraska-3")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nevada';\">Nevada</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Nevada")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Nevada")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Nevada")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Nevada")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_Hampshire';\">New Hampshire</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("New Hampshire")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("New Hampshire")+"</a><a>Winner %: "+obj.getWinnerVotePercent("New Hampshire")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("New Hampshire")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_Jersey';\">New Jersey</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("New Jersey")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("New Jersey")+"</a><a>Winner %: "+obj.getWinnerVotePercent("New Jersey")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("New Jersey")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_Mexico';\">New Mexico</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("New Mexico")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("New Mexico")+"</a><a>Winner %: "+obj.getWinnerVotePercent("New Mexico")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("New Mexico")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_York_(state)';\">New York</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("New York")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("New York")+"</a><a>Winner %: "+obj.getWinnerVotePercent("New York")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("New York")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/North_Carolina';\">North Carolina</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("North Carolina")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("North Carolina")+"</a><a>Winner %: "+obj.getWinnerVotePercent("North Carolina")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("North Carolina")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/North_Dakota';\">North Dakota</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("North Dakota")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("North Dakota")+"</a><a>Winner %: "+obj.getWinnerVotePercent("North Dakota")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("North Dakota")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Ohio';\">Ohio</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Ohio")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Ohio")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Ohio")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Ohio")+
                    "</div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Oklahoma';\">Oklahoma</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Oklahoma")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Oklahoma")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Oklahoma")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Oklahoma")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Oregon';\">Oregon</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Oregon")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Oregon")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Oregon")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Oregon")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Pennsylvania';\">Pennsylvania</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Pennsylvania")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Pennsylvania")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Pennsylvania")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Pennsylvania")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Rhode_Island';\">Rhode Island</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Rhode Island")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Rhode Island")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Rhode Island")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Rhode Island")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/South_Carolina';\">South Carolina</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("South Carolina")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("South Carolina")+"</a><a>Winner %: "+obj.getWinnerVotePercent("South Carolina")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("South Carolina")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/South_Dakota';\">South Dakota</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("South Dakota")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("South Dakota")+"</a><a>Winner %: "+obj.getWinnerVotePercent("South Dakota")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("South Dakota")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Tennessee';\">Tennessee</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Tennessee")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Tennessee")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Tennessee")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Tennessee")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Texas';\">Texas</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Texas")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Texas")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Texas")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Texas")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Utah';\">Utah</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Utah")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Utah")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Utah")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Utah")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Vermont';\">Vermont</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Vermont")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Vermont")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Vermont")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Vermont")+
                    "</div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Virginia';\">Virginia</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Virginia")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Virginia")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Virginia")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Virginia")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Washington_(state)';\">Washington</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Washington")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Washington")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Washington")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Washington")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/West_Virginia';\">West Virginia</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("West Virginia")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("West Virginia")+"</a><a>Winner %: "+obj.getWinnerVotePercent("West Virginia")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("West Virginia")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Wisconsin';\">Wisconsin</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Wisconsin")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Wisconsin")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Wisconsin")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Wisconsin")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Wyoming';\">Wyoming</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("Wyoming")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("Wyoming")+"</a><a>Winner %: "+obj.getWinnerVotePercent("Wyoming")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("Wyoming")+
                    "</div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Washington,_D.C.';\">D.C</button><div class=\"dropdown-content\">"
                    + "<a>Winner: "+obj.getWinnerName("District of Columbia")+"</a><a>Electoral Votes: "+obj.getElectoralVotes("District of Columbia")+"</a><a>Winner %: "+obj.getWinnerVotePercent("District of Columbia")+"</a><a>2nd Place %: "+obj.getLoserVotePercent("District of Columbia")+
                    "</div></div></td>");
                
                //closes out the table and the body
                System.out.println("</tr></body></html>");
        }
}
