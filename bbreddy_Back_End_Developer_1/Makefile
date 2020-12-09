run: compile
	java MyWebpage

compile:
	javac HashTableMap.java
	javac Cities.java
	javac ElectionBackEnd.java
	javac MyWebpage.java
	javac -cp .:junit5.jar CityTest.java

test:
	java -jar junit5.jar --class-path . --scan-classpath --details tree

clean:
	$(RM) *.class
