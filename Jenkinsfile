stage('Gradle Build') {
    node{
    if (isUnix()) {
        dir('sub-dir') {sh './gradlew clean build -x test'}
    } else {
        dir('sub-dir') {bat 'gradlew clean build -x test'}
    }
    }
}
