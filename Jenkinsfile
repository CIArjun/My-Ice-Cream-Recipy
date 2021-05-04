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
        stage('Sonar Analysis'){
            step{
                def MAVEN_HOME = tool name: 'maven-3', type: 'maven'
            withSonarQubeEnv('sonar') {
                sh "${MAVEN_HOME}/bin/mvn sonar:sonar"
              }
            }
        }     
       
    }
}
