public class MyWebpage {
        USElectionData u = new USElectionData();
        HashTableMap<String, ArrayList<String>> map = new HashTableMap<>();
        ArrayList<String> list = new ArrayList<>();
        ElectionBackEnd obj = new ElectionBackEnd();
        public static void main(String[] args) {
                System.out.println("<html><head><title>2020 Election Results</title><style>");
                System.out.println("body{background-color: AliceBlue;padding-bottom: 50px;}");
                System.out.println("h1{color: DodgerBlue;text-align: center;font-size: 100px;font-family: Verdana;}");
                System.out.println(".button{font-size: 16px;background-color: Dimgray;color: white;border: none;text-align: center;width: 120px;height: 50px;}");
                System.out.println(".blue:hover{background-color: DodgerBlue;}");
                System.out.println(".red:hover{background-color: FireBrick;}");
                System.out.println(".red:active{background-color: FireBrick;}");
                System.out.println(".blue:active{background-color: DodgerBlue;}");
                System.out.println("table{margin-left: auto;margin-right: auto;}");
                System.out.println("p{color: DodgerBlue;font-size: 30px;text-align: center;}");
                System.out.println(".center{display: block;margin-left: auto;margin-right: auto;width: 50%;}");
                System.out.println(".dropdown{position: relative;display: inline-block;}");
                System.out.println(".dropdown-content {display: none;position: absolute;background-color: #f1f1f1;min-width: 160px;box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);z-index: 1;}");
                System.out.println(".dropdown-content a {color: black;padding: 12px 16px;text-decoration: none;display: block;}");
                System.out.println(".dropdown:hover .dropdown-content {display: block;}");
                System.out.println("</style></head><body>");

                System.out.println("<h1>2020 Election Results</h1>");
                System.out.println("<img src = \"https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/ElectoralCollege2020_with_results.svg/1200px-ElectoralCollege2020_with_results.svg.png\" cla
ss=\"center\">");
                System.out.println("<p>Hover over any of the buttons below to view the election results from that state or district!</p>");
                System.out.println("<p>Click on them to learn more about them!</p>");

                System.out.println("<table><tr>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Alabama';\">Alabama</button><div class=\"dropdown-c
ontent\"><a>"+obj.getWinnerName("Alabama")+"</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Alaska';\">Alaska</button><div class=\"dropdown-con
tent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Arizona';\">Arizona</button><div class=\"dropdown-
content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Arkansas';\">Arkansas</button><div class=\"dropdown
-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/California';\">California</button><div class=\"dro
pdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Colorado';\">Colorado</button><div class=\"dropdow
n-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Connecticut';\">Connecticut</button><div class=\"d
ropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Delaware';\">Delaware</button><div class=\"dropdow
n-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Florida';\">Florida</button><div class=\"dropdown-c
ontent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Georgia_(U.S._state)';\">Georgia</button><div clas
s=\"dropdown-content\"><a>Link 1</a></div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Hawaii';\">Hawaii</button><div class=\"dropdown-co
ntent\"><a>Link 1</a></div> </div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Idaho';\">Idaho</button><div class=\"dropdown-conte
nt\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Illinois';\">Illinois</button><div class=\"dropdow
n-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Indiana';\">Indiana</button><div class=\"dropdown-c
ontent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Iowa';\">Iowa</button><div class=\"dropdown-content
\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Kansas';\">Kansas</button><div class=\"dropdown-con
tent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Kentucky';\">Kentucky</button><div class=\"dropdown
-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Louisiana';\">Louisiana</button><div class=\"dropdo
wn-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maine';\">Maine-1</button><div class=\"dropdown-co
ntent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maine';\">Maine-2</button><div class=\"dropdown-co
ntent\"><a>Link 1</a></div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maine';\">Maine-3</button><div class=\"dropdown-con
tent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Maryland';\">Maryland</button><div class=\"dropdow
n-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Massachusetts';\">Massachusetts</button><div class
=\"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Michigan';\">Michigan</button><div class=\"dropdow
n-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Minnesota';\">Minnesota</button><div class=\"dropd
own-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Mississippi';\">Mississippi</button><div class=\"dr
opdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Missouri';\">Missouri</button><div class=\"dropdown
-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Montana';\">Montana</button><div class=\"dropdown-c
ontent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-1</button><div class=\"dropdo
wn-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-2</button><div class=\"dropdo
wn-content\"><a>Link 1</a></div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-3</button><div class=\"dropd
own-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nebraska';\">Nebraska-4</button><div class=\"dropdo
wn-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Nevada';\">Nevada</button><div class=\"dropdown-co
ntent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_Hampshire';\">New Hampshire</button><div class
=\"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_Jersey';\">New Jersey</button><div class=\"dro
pdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_Mexico';\">New Mexico</button><div class=\"dro
pdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/New_York_(state)';\">New York</button><div class=\
"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/North_Carolina';\">North Carolina</button><div clas
s=\"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/North_Dakota';\">North Dakota</button><div class=\"
dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Ohio';\">Ohio</button><div class=\"dropdown-content
\"><a>Link 1</a></div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Oklahoma';\">Oklahoma</button><div class=\"dropdown
-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Oregon';\">Oregon</button><div class=\"dropdown-co
ntent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Pennsylvania';\">Pennsylvania</button><div class=\
"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Rhode_Island';\">Rhode Island</button><div class=\
"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/South_Carolina';\">South Carolina</button><div clas
s=\"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/South_Dakota';\">South Dakota</button><div class=\"
dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Tennessee';\">Tennessee</button><div class=\"dropdo
wn-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Texas';\">Texas</button><div class=\"dropdown-conte
nt\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Utah';\">Utah</button><div class=\"dropdown-content
\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Vermont';\">Vermont</button><div class=\"dropdown-
content\"><a>Link 1</a></div></div></td>");

                System.out.println("</tr><tr>");

                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Virginia';\">Virginia</button><div class=\"dropdow
n-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Washington_(state)';\">Washington</button><div cla
ss=\"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/West_Virginia';\">West Virginia</button><div class=
\"dropdown-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Wisconsin';\">Wisconsin</button><div class=\"dropd
own-content\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button red\" onclick=\"location.href='https://en.wikipedia.org/wiki/Wyoming';\">Wyoming</button><div class=\"dropdown-c
ontent\"><a>Link 1</a></div></div></td>");
                System.out.println("<td><div class=\"dropdown\"><button class=\"button blue\" onclick=\"location.href='https://en.wikipedia.org/wiki/Washington,_D.C.';\">D.C</button><div class=\"drop
down-content\"><a>Link 1</a></div></div></td>");

                System.out.println("</tr></body></html>");
        }
        
        private String getWinner(String state) {
                return obj.getWinnerName(state);
        }
}
