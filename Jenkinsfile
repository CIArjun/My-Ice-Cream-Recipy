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
                 sh 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9000/sonar -Dsonar.login=098b2bdd32e8e0cbc4ed7186e70d5526f3ae5432'
              }
          }
      }  
       
    }
}
