# Task Manager API

A simple and complete Task Management REST API built with Java, Spring Boot, and H2 Database.  
This project demonstrates how to build a full-featured backend application using Spring Boot, following best practices like MVC architecture, layered service design, and RESTful API standards.

## Features

- Create, read, update, and delete tasks
- In-memory H2 database for simplicity (no external setup)
- RESTful endpoints using Spring Web
- Project structured with clear separation of concerns
- Tested with Postman

## Technologies Used

- Java 21
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

The application exposes the following endpoints once it's running (`mvn spring-boot:run` or run directly via IDE):

| Method | Endpoint           | Description             |
|--------|--------------------|-------------------------|
| GET    | `/api/tasks`       | Retrieve all tasks      |
| GET    | `/api/tasks/{id}`  | Retrieve task by ID     |
| POST   | `/api/tasks`       | Create a new task       |
| PUT    | `/api/tasks/{id}`  | Update an existing task |
| DELETE | `/api/tasks/{id}`  | Delete a task           |
