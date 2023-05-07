def call (){
    withSonarQubeEnv(credentialsId: 'sonarQube') {
    sh 'npm install sonar-scanner'
    }
}