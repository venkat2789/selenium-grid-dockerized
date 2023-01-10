# selenium-grid-dockerized

An approach to run selenium UI tests on a dockerized selenium grid with a hub and nodes for different browsers e.g. chrome, firefox etc.

Uses images: [hub](https://hub.docker.com/r/selenium/hub), [node-firefox](https://hub.docker.com/r/selenium/node-firefox), [node-chrome](https://hub.docker.com/r/selenium/node-chrome)

## Pre-requisites:
- Docker
- Docker Desktop (not mandatory, but recommended to start stop the daemon engine)
- Start the docker engine

Refer: [Docker Docs](https://docs.docker.com/engine/install/)

## Steps to run:
All configurations to hub and nodes are in [docker-compose.yaml](docker-compose.yaml) file, add/modify nodes based on needs. 
To spin up containers, run
`docker-compose up`

To run in detached mode, run
`docker-compose up -d`

Go to [MainTest](src/test/java/tests/MainTest.java) to run the sample tests. Add more tests, edit browser configs in [DriverSetup](src/test/java/config/DriverSetup.java). Following dependencies are already included:
- Selenium 4
- TestNG 7

#### After execution:
`docker-compose down`

### Other useful docker commands:

`docker container ps` - list running containers </br>

`docker container ps -a` - list running and stopped containers </br>

`docker container logs <name or id of container>` - when running in detached mode, to see container logs </br>

`docker exec -ti <name or id of container> /bin/bash` - shell into running container to run commands on container's terminal.
`-t` - allocates pseudo tty (unix terminology)
`-i` - keeps std in open
