JAR_FILE=pia-lexico/target/pia-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar
AGENT=../agent.jar
GCC=/bin/gcc
TMP=/tmp
JAVA_HOME=/usr/lib/jvm/default
MAVEN=/usr/lib/netbeans/java/maven/bin/mvn

build:
	cd pia-lexico; JAVA_HOME=$(JAVA_HOME) $(MAVEN) clean install
run-tests:
	java -jar $(AGENT) "java -jar $(JAR_FILE)" $(GCC) $(TMP) ../tests/ "760479,758606,760650" lexico
