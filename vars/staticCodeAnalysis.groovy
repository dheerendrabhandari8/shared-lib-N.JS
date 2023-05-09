def call (){

////

    withSonarQubeEnv(credentialsId: 'sonarQube') {
   sh "${scannerHome}/bin/sonar-scanner"

   sh 'npm install sonar-scanner'
    }

}
