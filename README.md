Spring Boot Microservices (Docker)

This project contains Spring Boot microservices using Spring Cloud, fully runnable with Docker Compose.

Services included:

Config Server

Eureka Discovery Service

API Gateway

Orders Service

Inventory Service

MySQL (separate DB per service)

Prerequisites

Docker

Docker Compose

Check:

docker --version
docker compose version

Docker Images Used
mysql:8.0
saitejajambarapu/config-server:latest
saitejajambarapu/discovery-service:latest
saitejajambarapu/api-gateway:latest
saitejajambarapu/orders-service:latest
saitejajambarapu/inventory-service:latest

How to Run

From project root (where docker-compose.yml is present):

docker compose up


If you changed configs:

docker compose up --build


To stop:

docker compose down


To stop and remove databases:

docker compose down -v

Check Running Services
Eureka Dashboard
http://localhost:8761


You should see:

API-GATEWAY

ORDERS

INVENTORY

API Gateway

All APIs are accessed via API Gateway.

Base URL:

http://localhost:8083

Orders Service APIs
Hello
curl http://localhost:8083/api/v1/orders/core/hello


Response:

Hello From Orders <config-value>

Orders → Inventory
curl http://localhost:8083/api/v1/orders/core/check


Response:

Hello From Inventory

Inventory Service APIs
Hello
curl http://localhost:8083/api/v1/inventory/core/hello


Response:

Hello From Inventory

Inventory → Orders
curl http://localhost:8083/api/v1/inventory/core/check


Response:

Hello From Orders <config-value>

Databases
Service	Database
Orders	orders
Inventory	inventory

Credentials:

username: user
password: password

Useful Commands

View logs:

docker compose logs orders-service
docker compose logs inventory-service
docker compose logs api-gateway


Check containers:

docker ps

Notes

All services communicate using Eureka

Inter-service calls use Feign

Config is loaded from Config Server

Each service has its own database

Run Summary
docker compose up
→ Open http://localhost:8761
→ Call APIs via http://localhost:8083
