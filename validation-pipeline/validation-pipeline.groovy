@library('parameters') _
@library('helper-methods') _

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