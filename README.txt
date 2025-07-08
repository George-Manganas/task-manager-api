
---

## Features

- Full CRUD task management
- RESTful API using Spring Boot
- React frontend with API integration
- In-memory H2 database (no external setup required)
- Clean project structure following MVC and service layering
- Tested with Postman and browser-based UI

---

## Technologies Used

### Backend
- Java 21
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

### Frontend
- React 18+
- JavaScript (ES6+)
- Axios (API requests)
- Bootstrap (UI styling)

---

## API Endpoints

Once the Spring Boot app is running (`mvn spring-boot:run` or from your IDE), the following endpoints are available at `http://localhost:8080/api/tasks`:

| Method | Endpoint           | Description             |
|--------|--------------------|-------------------------|
| GET    | `/api/tasks`       | Get all tasks           |
| GET    | `/api/tasks/{id}`  | Get task by ID          |
| POST   | `/api/tasks`       | Create a new task       |
| PUT    | `/api/tasks/{id}`  | Update an existing task |
| DELETE | `/api/tasks/{id}`  | Delete a task           |

---

## Running the Project

### 1. Backend (Spring Boot)
```bash
cd task-manager-api/task-manager-api
mvn spring-boot:run
