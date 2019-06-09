pipeline {
    agent any

    stages {
        stage ('Build App') {
            steps {
                withMaven(maven : 'maven_3_6_1') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Test App') {
            steps {
                withMaven(maven : 'maven_3_6_1') {
                    sh 'mvn test'
                }
            }
        }

        stage('SonarQube analysis') {
            // requires SonarQube Scanner 2.8+
            def scannerHome = tool 'SonarQube Scanner 2.8';
            withSonarQubeEnv('My SonarQube Server') {
                sh "${scannerHome}/bin/sonar-scanner"
            }
        }

        stage ('Deploy App') {
            steps {
                withMaven(maven : 'maven_3_6_1') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}