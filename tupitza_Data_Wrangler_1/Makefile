run: compile
	java MyWebpage

compile:
	javac HashTableMap.java
	javac USElectionData.java
	javac ElectionBackEnd.java
	javac MyWebpage.java

test: TestApplication.class
	java -jar junit5.jar -cp . --scan-classpath -n TestApplication

TestApplication.class:
	javac -cp .:junit5.jar TestApplication.java

clean:
	$(RM) *.class
