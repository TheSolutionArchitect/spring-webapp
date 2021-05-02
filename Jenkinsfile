pipeline {
    agent any
    tools{
    maven 'maven'
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
