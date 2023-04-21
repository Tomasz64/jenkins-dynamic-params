pipeline {
    libraries {
        lib('helper-methods')
        lib('parameters')
    }

    agent any

    stages {
        stage('Prepare Parameters') {
            steps {
                script{
                    parameters.params()
                }
            }
        }
                stage('Use Lib') {
            steps {
                script {
                    helper-methods.changeBuildName("VALIDATION")
                }
            }
        }
    }
}