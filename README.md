# 🏦 Customer Service API — Powered by Naga Jaya Teja Puducheri

[![Build](https://img.shields.io/badge/build-passing-brightgreen)](#)
[![Java](https://img.shields.io/badge/java-17-blue)](#)
[![License](https://img.shields.io/badge/license-MIT-lightgrey)](#)

A secure, scalable RESTful microservice built using **Spring Boot**, enabling CRUD operations for managing customer data in a banking ecosystem. This project includes JWT-based authentication, Spring Security, and is structured for maintainability and performance.

---

## 🚀 Features

- ✅ JWT-based login and authentication system
- 🔐 Role-protected API endpoints using Spring Security
- 📊 CRUD operations for customer management
- ⚙️ Clean layered architecture (Controller → Service → Repository)
- 🧪 Unit & integration tests with JUnit
- 💡 Extensible structure for enterprise microservices

---

## 🛠️ Tech Stack

| Category         | Tools & Technologies          |
|------------------|-------------------------------|
| Language         | Java 17                       |
| Framework        | Spring Boot, Spring Security  |
| Authentication   | JWT (JSON Web Tokens)         |
| Data Persistence | Spring Data JPA, H2/MySQL     |
| Build Tool       | Maven                         |
| API Testing      | Postman, JUnit                |
| Version Control  | Git                           |

---

## 📁 Project Structure


customer-service/ ├── controller/ # REST APIs for customers and auth ├── service/ # Business logic ├── repository/ # Database layer ├── model/ # Domain/entity classes ├── config/ # Spring Security config ├── filters/ # JWT token filters ├── utils/ # Helper classes like JwtUtil ├── exception/ # Custom exceptions └── resources/ └── application.properties

yaml
Copy
Edit

---

## 🔐 JWT Authentication Flow

1. Send a POST request to `/auth/login` with valid credentials
2. Get a JWT token in the response
3. Use `Authorization: Bearer <token>` in header for secured API calls

---

## 📮 API Endpoints

| Method | Endpoint               | Description                       | Security |
|--------|------------------------|-----------------------------------|----------|
| POST   | `/auth/login`          | Authenticate user and get token   | ❌ No    |
| GET    | `/api/customers`       | Retrieve all customers            | ✅ Yes   |
| GET    | `/api/customers/{id}`  | Get customer by ID                | ✅ Yes   |
| POST   | `/api/customers`       | Add a new customer                | ✅ Yes   |
| PUT    | `/api/customers/{id}`  | Update existing customer          | ✅ Yes   |
| DELETE | `/api/customers/{id}`  | Delete customer                   | ✅ Yes   |

> 🔐 All `/api/customers/**` routes are protected. Add JWT token in the `Authorization` header.

---

## 💻 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven

### 🏁 Run the Project

```bash
git clone https://github.com/your-username/customer-service.git
cd customer-service
./mvnw spring-boot:run
The app runs at http://localhost:8080

Login via POST /auth/login

🧪 Testing
Run the test cases:

bash
Copy
Edit
./mvnw test
Test files are placed under:

swift
Copy
Edit
src/test/java/com/bank/customer/
🌐 Swagger API Docs (if enabled)
url
Copy
Edit
http://localhost:8080/swagger-ui.html
🚀 Future Enhancements
📘 Swagger/OpenAPI integration

🐳 Dockerize the project

☁️ Deploy to AWS/GCP

🔑 Add Role-Based Access Control (RBAC)

🧵 Integrate Kafka for event streaming

👤 Author
Naga Jaya Teja Puducheri
Backend API Developer | Spring Boot Enthusiast | Problem Solver
📧 puducherinagajayateja@gmail.com
🔗 LinkedIn

📄 License
This project is licensed under the MIT License.
Feel free to fork, contribute, and build something amazing! 🚀

yaml
Copy
Edit
