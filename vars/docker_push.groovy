def call(String Project, String ImageTag, String dockerHubUser){
    withCredentials([usernamePassword(
        credentialsId: DockerHubCred,
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {
    }
    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}
}
