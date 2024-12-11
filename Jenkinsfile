pipeline{
    agent any
    stages {
        stage ('Build'){
            steps{
                echo "Etapa de Build no disponible"
            }
        }
    }

    stage ('Tests'){
        steps{
            echo "Etapa TEST no disponible"
        }
    }
    stage ('Deploy'){
        steps{
            sh "docker-compose down -v"
            sh "docker-compose up -d --build"

        }
    }
}