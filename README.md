# Aw Core Release Test

- [Aw Core Release Test](#aw-core-release-test)
  - [About Project](#about-project)
    - [Build With](#build-with)
    - [Getting Started](#getting-started)
      - [GCP Setup](#gcp-setup)
      - [Gradle Setup](#gradle-setup)
      - [Java](#java)
      - [Running Project](#running-project)
        - [Development](#development)
        - [Test](#test)
        - [CICD](#cicd)
        - [Manual Deployment](#manual-deployment)
      - [Versioning](#versioning)




-----------------
## About Project

Internal testing and feature release project.

### Build With

List the tools required to build the project

1.  Java
2.  Gradle Build Tool Version
3.  Gcloud CLI
4.  Spring
5.  Fullauth

### Getting Started

Instruction to check out the project

#### GCP Setup

To configure the GCloud CLI and setup refer to the documentation [here](https://github.com/Adaptavant/internal-services/blob/master/Built-Tools/gcp-setup.md).

#### Gradle Setup

To configure the Gradle refer to the documentation [here](https://gradle.org/install/).

#### Java

Ref here To download [java](https://adoptium.net/).
After installing the java , you need to run in your console:


```console
java --version
```


[IntelliJ](https://www.jetbrains.com/idea/download/) - Recommended editor
#### Running Project

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

##### Development
To develop locally:

```console
./gradlew build
```

Which will start the server and wait for the changes to restart if required.

##### Test

We are using the Junit framework for unit testing.


```console
./gradlew test
```


##### CICD

To configure the CICD pipeline refer this [repository](
https://github.com/Adaptavant/awcore-workflows/), which gives some examples and steps on how to use it.

##### Manual Deployment

For deploying manually you need to run the gradle `appengine deploy` task.

```console
./gradlew appengine deploy
```
#### Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/Adaptavant/anywhere-hours/tags).



