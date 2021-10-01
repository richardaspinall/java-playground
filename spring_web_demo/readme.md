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
│   │                       . . .
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

## Usage

Index: `http://localhost:9090/myapp/`

POST user: `http://localhost:9090/myapp/user`
```
curl -d \
'{ "id": 1, 
"name": "Scott", 
"phone": "555-555-555", 
"enabled": true }' \
-H "Content-Type: application/json" \
-X POST http://localhost:9090/myapp/user
```

POST users: `http://localhost:9090/myapp/users`

```
curl --location --request POST 'http://localhost:9090/myapp/users' \
--header 'Content-Type: application/json' \
--data-raw '[
    {
        "id": 1,
        "name": "Scott",
        "phone": "555-555-555",
        "enabled": true
    },
    {
        "id": 2,
        "name": "Richard",
        "phone": "777-777-777",
        "enabled": true
    }
]'
```