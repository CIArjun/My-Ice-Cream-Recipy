pipeline {
    agent {
        docker {
            image 'maven:3.8-openjdk-11' 
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
                
               
            }
        }
          stage("SonarQube Analysis") {
                   steps {
              withSonarQubeEnv('sonar') {
                 sh 'mvn sonar:sonar -Dsonar.host.url=http://05ef463b1d58.ngrok.io/sonar -Dsonar.login=61e4bed9a3833683c096c02ef3bbd43e68608bc2'
              }
          }
      }  
       
    }
}
