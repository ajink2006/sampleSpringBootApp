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

        stage ('Deploy App') {

            steps {
                withMaven(maven : 'maven_3_6_1') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}