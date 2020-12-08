run: compile
	java -jar junit5.jar --class-path . --scan-classpath --details tree
	
compile: 
	javac HashTableMap.java
	javac USElectionData.java
	javac ElectionBackEnd.java
	javac -cp .:junit5.jar TestApplication.java

test: 
	java -jar junit5.jar --class-path . --scan-classpath --details tree

clean:
	$(RM) *.class
