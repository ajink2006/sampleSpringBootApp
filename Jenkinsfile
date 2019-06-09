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
            steps {
                script {
                    scannerHome = tool 'SonarQube Scanner 3.3.0'
                }
                withSonarQubeEnv('SonarQube') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
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