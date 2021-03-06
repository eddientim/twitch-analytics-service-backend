# twitch-analytics-service-backend
This project provides analytics provided by the twitch API. For more info see the twitch API reference https://dev.twitch.tv/docs/api/reference 

#### Status

[![Build Status](https://travis-ci.com/eddientim/twitch-analytics-service-backend.svg?branch=main)](https://travis-ci.com/eddientim/twitch-analytics-service-backend)
![Docker Cloud Build Status](https://img.shields.io/docker/cloud/build/eddientim/twitch-analytics-service-backend)
## Tech Stack 
- Spring Framework
- Java 11
- Mongo DB
- Docker
- Maven
- Junit 5

## Run docker container app locally
```bash
# run the container
source run-container.sh
```

## Run tests
```bash
mvn test
```
## Run app with Docker
Pull the latest docker image down to run the application with docker only:
https://hub.docker.com/r/eddientim/twitch-analytics-service-backend

## Ports
This project uses port "8080" as default

### License
MIT License

Copyright (c) 2020 eddientim
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
