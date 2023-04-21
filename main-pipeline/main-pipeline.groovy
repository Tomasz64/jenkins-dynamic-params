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
    }
}