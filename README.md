# dockerpublish

How to push the docker image to docker hub using dockerfile and spotify maven plugin

Steps: 
1. Go to https://start.spring.io/ and create a spring boot project with spring web dependency.
2. Download the project and open in any othe the ID. i.e - intellij Idea
3. Change the port in application.properties file. - server.port=9091
4. Create a HomeController and add a expose a endpoint.
5. Create docker file and add the content below in the docker file.
    FROM openjdk:11
    ARG JAR_FILE=target/*.jar
    COPY ${JAR_FILE} app.jar
   ENTRYPOINT ["java","-jar","/app.jar"]
7. Add the spotify maven plugin in the plugins tab and change the repo name and image name. please refer the pom.xml plugins section.
     <plugin>
                <groupId>com.spotify</groupId>
                <artifactId>dockerfile-maven-plugin</artifactId>
                <version>1.4.3</version>
                <executions>
                    <execution>
                        <id>default</id>
                        <goals>
                            <goal>build</goal>
                            <goal>push</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <repository>ssyadavin/dockerpublish</repository>
                    <tag>${project.version}</tag>
                </configuration>
                <dependencies>
                    <!-- To make this work on JDK 9+ -->
                    <dependency>
                        <groupId>javax.activation</groupId>
                        <artifactId>javax.activation-api</artifactId>
                        <version>1.2.0</version>
                    </dependency>
                </dependencies>
            </plugin>
8. Verify docker is intalled and running in your local system.
   docker -v
10. Login to dockerhub and verify the repository. same name repository should not already exists.
11. Go to intellij idea and goto terminal and run the below command
 mvn clean package dockerfile:push
11. if no error image should be push to docker hub. veify the image in the dockerhub
