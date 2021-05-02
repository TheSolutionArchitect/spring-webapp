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
        
        stage('SCA') {
            steps {
                sh 'owasp* || true'
                sh 'wget "https://raw.githubusercontent.com/awstechguide/spring-webapp/master/owasp-dependency-checker.sh"'
                sh 'chmod +x owasp-dependency-checker.sh'
                sh 'bash owasp-dependency-checker.sh'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
