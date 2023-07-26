# Docker 

## Docker build image

Building docker image:
`./gradlew bootBuildImage --imageName=bb/example/emulator:latest`

## Docker run container

Docker Run:
`docker run --name  emulator-example -p 15000:8080 -d bb/example/emulator:latest`