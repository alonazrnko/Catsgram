# Catsgram — Social Media Backend API

A RESTful backend service for a social media application where users can publish posts with images, interact with content, and manage their profiles.

## Features

- **User management** — registration, profile retrieval and updates
- **Post management** — create, retrieve and paginate posts
- **Image upload and storage** — attach images to posts
- **Layered architecture** — clean separation of controller, service and data access layers
- **DTO & mappers** — API models decoupled from persistence models
- **Centralized error handling** — global exception handler with meaningful error responses
- **Request validation** — incoming data validated before processing
- **Dockerized** — runs fully in Docker with a single command

## Tech Stack

- **Java 21**
- **Spring Boot 3.2**
- **Spring JDBC** — data access without ORM overhead
- **PostgreSQL** — primary relational database
- **Lombok** — boilerplate reduction
- **Docker & Docker Compose** — containerized local environment
- **Maven** — build and dependency management
- **Checkstyle** — enforced code style

## Architecture

The application follows a classic layered architecture:

**Controller** → **Service** → **DAL/DAO** → **PostgreSQL**

- `controller` — REST endpoints, request/response handling
- `service` — business logic and application rules
- `dal` — data access layer, SQL queries via Spring JDBC
- `dto` — API-facing models
- `mapper` — conversion between DTOs and domain models
- `model` — core domain entities
- `exception` — custom exceptions and global handler

## Getting Started

### Requirements
- Docker and Docker Compose installed

### Run locally

```bash
git clone https://github.com/alonazrnko/catsgram.git
cd catsgram
docker compose up --build
```

The API will be available at `http://localhost:8080`

### Stop the application

```bash
docker compose down
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/users` | Get all users |
| POST | `/users` | Create a new user |
| GET | `/users/{id}` | Get user by ID |
| PUT | `/users/{id}` | Update user |
| GET | `/posts` | Get all posts (with pagination) |
| POST | `/posts` | Create a new post |
| GET | `/posts/{id}` | Get post by ID |
| POST | `/posts/{id}/images` | Upload image to post |

## Key Design Decisions

- **Spring JDBC over JPA** — explicit SQL queries give full control over data access and make query behavior predictable
- **DAO pattern** — each entity has a dedicated data access object, keeping persistence logic isolated
- **Docker Compose** — PostgreSQL and the application run in isolated containers, making local setup reproducible with a single command
- **Checkstyle** — enforced at compile time to maintain consistent code style across the project