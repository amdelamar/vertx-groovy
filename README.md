# vertx-groovy

A simple Groovy webapp using Eclipse [Vert.x](http://vertx.io)

## Prerequisites

* [JDK 1.8+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Groovy 3.0+](http://groovy-lang.org/download.html)

## Download and Build

1. Download code `git clone https://github.com/amdelamar/vertx-groovy`
1. `cd vertx-groovy`
1. Run build `./gradlew clean build`

## Run 

1. Start server `groovy build/libs/vertx-groovy-0.1.0.jar`
1. Visit [http://localhost:8080/](http://localhost:8080/) to see the app running.

## Run with Redeploy

App can be run in redeploy mode, so any changes to files are recompiled quickly. Which is useful for development.

1. Run redeploy `./gradlew run`
1. Visit [http://localhost:8080/](http://localhost:8080/) to see the app running.

This last command launches the application and redeploys as soon as you change something in `src/`.
