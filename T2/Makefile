JAR_FILE=pia-sintatico/target/pia-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar
AGENT=../agent.jar
GCC=/bin/gcc
TMP=/tmp
JAVA_HOME=/usr/lib/jvm/default
MAVEN=/usr/lib/netbeans/java/maven/bin/mvn

build:
	cd pia-sintatico; JAVA_HOME=$(JAVA_HOME) $(MAVEN) clean install
run-tests:
	java -jar $(AGENT) "java -jar $(JAR_FILE)" $(GCC) $(TMP) ../tests/ "76079,758606" sintatico
