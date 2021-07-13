stage('Gradle Build') {
    node{
    if (isUnix()) {
        sh './gradlew clean build -x test'
    } else {
        bat 'gradlew clean build -x test'
    }
    }
}
