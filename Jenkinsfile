pipeline {
    agent any
    stages {
        stage('Welcome') { 
            steps { 
               echo 'This is a DevSecOps pipeline created by AWSTechGuide' 
            }
        }
        stage('Pull Sources') {
            steps {
             git url: 'https://github.com/awstechguide/spring-webapp.git'
            }
         }
        
        stage('Check-Git-Secrets') {
            steps {
             sh 'docker pull gesellix/trufflehog'
			 sh 'docker run -t gesellix/trufflehog --json https://github.com/awstechguide/spring-webapp.git'
            }
         }
        
        stage('SCA') {
            steps {
                echo 'Initiating  Source Composition Analysis by OWASP' 
                sh 'rm owasp* || true'
                sh 'wget "https://raw.githubusercontent.com/awstechguide/spring-webapp/master/owasp-dependency-checker.sh"'
                sh 'chmod +x owasp-dependency-checker.sh'
                sh 'bash owasp-dependency-checker.sh'
                sh 'cat /var/lib/jenkins/OWASP-Dependency-Check/reports/dependency-check-report.xml'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
