pipeline {
    agent any
    stages {
        stage('Prepare Parameters') {
            steps {
                script{
                    parameters.params()
                }
            }
        }
    }
}