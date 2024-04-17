pipeline {
    agent any
    stages {
        stage('Jenkins Products') {
            steps {
                echo 'Jenkins Products'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}