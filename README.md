# My-Ice-Cream-Recipy
Added Webhook trigger for jenkins job
Sonar Analysis Done :)
Nexus will work this time   :)
Lets try agian :)
Testing hook

{
        docker {
            image 'maven:3.8-openjdk-11' 
            args '-v /root/.m2:/root/.m2'
        }


<plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-deploy-plugin</artifactId>
   <version>2.8.1</version>
   <configuration>
      <skip>true</skip>
   </configuration>
</plugin>
