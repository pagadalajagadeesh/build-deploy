stage('Gradle Build') {
    node{
    if (isUnix()) {
        dir('sub-dir') {sh './gradlew clean build'}
    } else {
        dir('sub-dir') {bat 'gradlew.bat clean build'}
    }
    }
}
