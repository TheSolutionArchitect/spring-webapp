pipeline {
    agent any
    tools{
    maven 'Maven'
    }
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
