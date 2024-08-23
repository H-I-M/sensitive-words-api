# Sensitive Words API

## Overview

The **Sensitive Words API** is a RESTful service designed to manage and sanitize sensitive words. The application allows users to retrieve, update, and sanitize sensitive words stored in the database. It is built with Java, Spring Boot, and uses a MySQL database.

## Features

- **Retrieve Sensitive Words:** Fetch a list of all sensitive words stored in the database.
- **Sanitize Words:** Replace sensitive words within a given text with an appropriate substitute.
- **Update Sensitive Words:** Add new sensitive words or update existing ones.

## Technologies Used

- **Java 17**
- **Spring Boot 3.3.2**
- **Gradle 7.4**
- **MySQL Database**

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 11 or higher installed.
- Gradle installed or use the provided `gradlew` script.
- MySQL database setup.

## API Endpoints
**GET /sensitive-words:** Retrieve a list of all sensitive words.
**POST /sanitize:** Sanitize a given text by replacing sensitive words.
**PUT /sensitive-words:** Add or update a sensitive word.


## Troubleshooting
Database Connection Issues: Ensure that your MySQL server is running and that the credentials in the application.properties file are correct.

The project uses Flyway for database migrations. The initial migration script is located in src/main/resources/db/migration/. Ensure your MySQL database is running and execute the application to apply the migrations.


