## Add agent to JVM (statically loading)

### What do you need?

-  ```java.lang.instrument``` package;
- Before JAR file creating for this agent, we need to make MANIFEST.MF with
```Premain-class: com.baeldung.objectsize.InstrumentationAgent```;
- Run ```javac InstrumentationAgent.java``` and the next is
- ```jar cmf MANIFEST.MF InstrumentationAgent.jar InstrumentationAgent.class```
- The next need to add next VM option: ```-javaagent:"path_to_agent_directory\InstrumentationAgent.jar"``` 
- And for simple java project without Gradle it is needed to add JAR to classpath


### For dynamically loading follow: 
```https://www.baeldung.com/java-instrumentation```

### For details follow: 
```https://www.baeldung.com/java-size-of-object```