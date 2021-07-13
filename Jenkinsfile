stage('Gradle Build') {
    if (isUnix()) {
        dir('sub-dir') {sh './gradlew clean build'}
    } else {
        dir('sub-dir') {bat 'gradlew.bat clean build'}
    }
}
