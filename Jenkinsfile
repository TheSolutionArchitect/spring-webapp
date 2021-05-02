pipeline {
    agent any
    stages {
        stage('Welcome') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage('Pull Sources') {
            steps {
             git url: 'https://github.com/awstechguide/spring-webapp.git'
            }
         }
        
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
