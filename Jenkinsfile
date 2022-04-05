pipeline {
agent any



parameters {
string(name:"VERSION", defaultValue:'1', description:'version to deploy')
choice(name:"Version", choices : ['1.1', '1.2', '1.3'], description:'')
booleanParam(name:'executeTests', defaultValue:true, description:"skip tests")
}



tools {
maven 'maven'
}




environment {
ORG_NAME = "ipu"
APP_NAME = "university-service"
APP_VERSION = "1.0-SNAPSHOT"
APP_CONTEXT_ROOT = "/"
APP_LISTENING_PORT = "8200"
TEST_CONTAINER_NAME = "ci-${APP_NAME}-${BUILD_NUMBER}"
PREV_CONTAINER_NAME="ci-${APP_NAME}-${currentBuild.previousBuild.number}"
}



stages {
stage('Compile') {
steps {
echo "-=- compiling project -=-"
bat "mvn clean compile"
}
}



stage('Package') {



when {
expression {
params.executeTests
}
}



steps {
echo "-=- packaging project -=-"
bat "mvn package -DskipTests=true"
archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
}
}



stage('Build Docker image') {
steps {
echo "-=- build Docker image -=-"
bat "docker build -t ${ORG_NAME}/${APP_NAME}:${APP_VERSION} -t ${ORG_NAME}/${APP_NAME}:latest ."
}
}



stage('Run Docker image') {
steps {
echo "-=- run Docker image -=-"

bat "docker run --name=university-service --detach --restart=always --network team-network -p 8200:8200 ${ORG_NAME}/${APP_NAME}:latest"
}
}




}
}