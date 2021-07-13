pipeline {
  environment {
    registry = '013570547371.dkr.ecr.us-east-1.amazonaws.com/build-deploy'
    registryCredential = 'AKIAQGKG6D2V6SW4JDAG'
    dockerImage = ''
  }
  agent any
  stages {
     stage('Building war') {
        if (isUnix()) {
          sh 'gradlew clean build -x test'
      } else {
          bat 'gradlew clean build -x test'
      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy image') {
        steps{
            script{
                docker.withRegistry("https://" + registry, "ecr:eu-central-1:" + registryCredential) {
                    dockerImage.push()
                }
            }
        }
    }
  }
}
