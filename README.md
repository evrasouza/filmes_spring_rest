# 🎬 Movies API - Controller Testing with Spring Boot

Study project focused on **unit and controller-level testing** in a Spring Boot application.

The main goal of this repository is to demonstrate how REST controllers can be tested without starting a full application server, using **Spring MockMVC**, **JUnit**, and **REST Assured**.

## 🛠 Tech Stack

- Java 11
- Spring Boot
- Spring Web
- Spring MockMVC
- REST Assured
- JUnit
- Maven
- Lombok

## 🎯 Project Purpose

This project explores testing strategies for the controller layer of a Spring Boot REST application.

Instead of relying only on end-to-end API tests, the tests focus on validating controller behavior directly using MockMVC.

This approach allows scenarios such as:

- HTTP status validation
- Request and response validation
- Controller behavior verification
- REST endpoint testing
- Faster feedback without starting a full external server

## 📁 Project Structure

```text
filmes_spring_rest/
├── src/
│   ├── main/          # Application source code
│   └── test/          # Automated tests
├── .mvn/              # Maven Wrapper configuration
├── pom.xml            # Project dependencies
├── mvnw
├── mvnw.cmd
└── README.md
```

## ⚙️ Requirements

The project uses:

- Java 11
- Maven

A Maven Wrapper is already included in the repository, so Maven does not necessarily need to be installed globally.

## ▶️ Running the Tests

### Linux / macOS

```bash
./mvnw test
```

### Windows

```bash
mvnw.cmd test
```

## 🧪 Testing Approach

The project combines:

**Spring MockMVC**

Allows HTTP requests to be simulated directly against Spring MVC controllers without starting a real HTTP server.

**REST Assured**

Provides a readable API for validating requests and responses.

**JUnit**

Used as the test framework for defining and executing the automated test scenarios.

## 📚 Learning Context

This repository was created as part of my studies in automated testing with Java and Spring Boot.

The implementation is based on a practical example demonstrating controller tests using Spring MockMVC and REST Assured.

Reference material:

https://www.youtube.com/watch?v=ngbKmhXDP4A

## 📌 Project Status

This is a study/reference project maintained as part of my QA and test automation portfolio.

Its main purpose is to demonstrate testing concepts at the **controller/API layer using Java and Spring Boot**.
