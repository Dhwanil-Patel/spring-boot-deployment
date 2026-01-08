pipeline {
    agent any

    tools {
        jdk 'java-21'
        maven 'maven-3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
//         stage('SonarQube Analysis') {
//             steps {
//                 withSonarQubeEnv('sonarqube-server') {
//                     bat 'mvn sonar:sonar'
//                 }
//             }
//         }
//         stage('Quality Gate') {
//             steps {
//                 timeout(time: 5, unit: 'MINUTES') {
//                     waitForQualityGate abortPipeline: true
//                 }
//             }
//         }
        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
//         stage('Publish to Artifactory') {
//             steps {
//                 withCredentials([usernamePassword(
//                     credentialsId: 'artifactory-creds',
//                     usernameVariable: 'ART_USER',
//                     passwordVariable: 'ART_PASS'
//                 )]) {
//                     bat '''
//                     mvn deploy -DskipTests ^
//                     -Dusername=%ART_USER% ^
//                     -Dpassword=%ART_PASS%
//                     '''
//                 }
//             }
//         }
    }
    post {
        success {
            echo 'Build successful 🎉'
        }
        failure {
            echo 'Build failed ❌'
        }
    }
}