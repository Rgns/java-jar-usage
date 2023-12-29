# How to compile java files
# How to create .JAR file via CLI
# How to run .JAR file via CLI
# How to run .JAR file dependent on other .JAR file via CLI


# java compilation
- javac src/main/java*.java
- javac src/main/java*.java

# java jar creation
- jar cf jarName.jar *.class

# java jar creation with main class
- jar cfe jarName.jar MyMainComponent *.class

# java jar creation with manifest file
- jar cfm jarName.jar test-manifest-dir/MANIFEST.MF *.class

# java jar running 
- java -jar jarName.jar

# java jar running with main class
- java -cp jarName.jar MyMainComponent

# java jar running with external jar
- java -cp jarName1.jar:jarName2.jar MyMainComponent

# java jar running with multiple external jars
- java -cp jarName1.jar:lib/* MyMainComponent
