# Catsgram 
Backend REST API for a social media application

Catsgram is a backend service for a social media–like application that allows users to publish posts with images, interact with content, and manage user profiles.  
The project is built with a layered architecture and focuses on clean backend design, database interaction, and production-like infrastructure.

---

## 🚀 Features

- User management
- Post creation and retrieval
- Image upload and storage
- RESTful API design
- Centralized error handling
- Validation of incoming requests
- Persistent data storage with PostgreSQL

---

## 🧱 Architecture

The application follows a **layered architecture**:

- **Controller layer** — REST controllers handling HTTP requests and responses
- **Service layer** — business logic and application rules
- **DAL / DAO layer** — data access logic
- **DTO & mappers** — separation of API models from persistence models
- **Exception handling** — global exception handler with meaningful error responses

This approach ensures clear separation of responsibilities and improves maintainability and testability.

---

## 🛠 Tech Stack

- **Java 21**
- **Spring Boot 3**
- **PostgreSQL**
- **Docker & Docker Compose**
- **Maven**
- **Lombok**
- **JUnit 5**

---

## 🗄 Database

- PostgreSQL is used as the primary database
- Database schema is initialized on startup
- Docker volumes are excluded from version control
- Data access is implemented via DAO pattern

---

## 🧪 API Testing

- REST endpoints are tested manually using Postman
- JSON-based request/response format
- Validation and error handling are verified through API tests

## 📌 Project Status

The project is actively developed and extended.
Planned improvements include:

- Extended test coverage
- Security and authorization
- Additional API features

## 👩‍💻 Author

**Alyona Nazarenko**
Java Backend Developer (Junior)

GitHub: https://github.com/alonazrnko

Email: alonazrnko@gmail.com