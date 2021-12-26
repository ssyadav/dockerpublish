# dockerpublish

How to push the docker image to docker hub using dockerfile and spotify maven plugin

Steps: 
1. Go to https://start.spring.io/ and create a spring boot project with spring web dependency.
2. Download the project and open in any othe the ID. i.e - intellij Idea
3. Change the port in application.properties file. - server.port=9091
4. Create a HomeController and add a expose a endpoint.
5. Create docker file and add the content below in the docker file.
7. Add the spotify maven plugin in the plugins tab and change the repo name and image name. please refer the pom.xml plugins section.
8. Verify docker is intalled and running in your local system.
   docker -v
10. Login to dockerhub and verify the repository. same name repository should not already exists.
11. Go to intellij idea and goto terminal and run the below command
 mvn clean package dockerfile:push
11. if no error image should be push to docker hub. veify the image in the dockerhub
