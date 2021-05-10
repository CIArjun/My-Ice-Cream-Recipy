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
        }
        stage("SonarQube Analysis") {
            steps {
                withSonarQubeEnv('sonar') {
                sh 'mvn sonar:sonar'
                  }
             }
           } 
	post {
          always {
             archiveArtifacts artifacts: 'target/jacoco.xml'
             junit  'target/surefire-reports/*.xml'
             }
	}
     }
}
