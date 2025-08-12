def call(String Project, String ImageTag, String dockerHubUser){
    withCredentials([usernamePassword(
        credentialsId: 'docker',
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {
    }
    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
