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
                 sh 'mvn sonar:sonar'
              }
          }
      } 
	  stage('Upload war to Nexus'){
	   steps{
		
		configFileProvider([configFile(fileId: 'm2-global', variable:'MVN_SETTINGS')]) {
   		 // some block
			sh 'mvn -s $MVN_SETTINGS clean package'
			}
	   }  
	  }
    }
}
