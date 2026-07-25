node {
    try {
        stage('Checkout Code') {
            echo 'Checking out code from repository...'
            // Replace with your repository URL
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/mrprasad98/Selenium_Java_Jenkins.git']]])
        }

        stage('Build') {
            echo 'Building the project...'
            bat 'mvn clean compile'
        }

        stage('Run Tests') {
            echo 'Running TestNG tests...'
            bat 'mvn test'
        }

        stage('Package') {
            echo 'Packaging the application...'
            bat 'mvn package'
        }

        stage('Deploy') {
            echo 'Deploying the application...'
            bat '''
            set DEPLOY_DIR=C:\\Automation
            if not exist "%DEPLOY_DIR%" mkdir "%DEPLOY_DIR%"
            copy target\\Selenium_Java_Jenkins-0.0.1-SNAPSHOT.jar "%DEPLOY_DIR%"
            '''
        }

        echo 'Pipeline executed successfully!'
    } catch (Exception e) {
        echo "Pipeline failed: ${e.message}"
        currentBuild.result = 'FAILURE'
    }
}