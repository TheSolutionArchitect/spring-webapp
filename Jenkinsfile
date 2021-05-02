pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
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
