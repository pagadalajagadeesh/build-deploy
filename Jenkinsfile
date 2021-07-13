pipeline {
  environment {
    registry = '013570547371.dkr.ecr.us-east-1.amazonaws.com/build-deploy'
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
          docker.withRegistry("https://" + registry,registryCredential) {
            dockerImage.push()
          }
        }
      }
    }
  }
}
