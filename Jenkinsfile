pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Prepare') {
            steps {
                sh '''VERSION-QUALIFIER=1.0
                NEW_VERSION={version-qualifier}.$(date +%Y%m%d%H%M%S)
                echo $NEW_VERSION'''
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo \'uploading artifacts to some repositories\''
            }
        }
    }
}