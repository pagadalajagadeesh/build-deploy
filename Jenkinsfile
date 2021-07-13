pipeline {
  environment {
    registry = 'build-deploy'
    registryCredential = 'AKIAQGKG6D2V6SW4JDAG'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Gradle build') {
      steps {
        bat 'gradlew clean build -x test'
      }
    }
    stage('Building docker image') {
      steps {
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy docker image') {
      steps {
        script {
            docker.withRegistry('https://013570547371.dkr.ecr.us-east-1.amazonaws.com', 'ecr:us-east-1:build-deploy') {
            docker.image('$registry:latest').push('latest')
          }
        }
      }
    }
  }
}
