# Spring Web Demo

**Generated from:**

https://start.spring.io/

**Dependencies**

Spring Web

## Run

Run: `./gradlew build` (if gradle was chosen in the initilizer)

- A `.jar` will be created in the `build/libs` folder

Run: `java -jar build/libs/*.jar` to run the application

## Configuration

Configuration file location: `/main/resources/application.properties`

Index: `server.servlet.context-path=/myapp`

Port: `server.port=9090`



## Structure
```
.
├── build.gradle
├── gradle
│   └── ...
├── gradlew
├── gradlew.bat
├── HELP.md
├── settings.gradle
└── src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── spring_web_demo
│   │               └── SpringWebDemoApplication.java
│   └── resources
│       └── static
│       │   └── index.html
│       └── application.properties
└── test
└── java
└── org
└── hyperskill
└── demo
└── DemoApplicationTests.java
```