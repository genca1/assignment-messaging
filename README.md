# Messaging App Backend
### Stack: Spring Boot · GraphQL · MongoDB · Docker

Follows layered architecture and applies separation of concerns. REST backend handles business logic, while BFF applies the Backend for Frontend pattern. Messaging is structured for extension into event-driven architecture using Kafka/RabbitMQ if needed.

## Features
- Signup / Login
- User-to-user Messaging
- Activity Logging
- User Blocking
- REST Backend + GraphQL BFF
- Dockerized
- Unit tested + Structured logging

## Run It
```bash
docker-compose up --build
