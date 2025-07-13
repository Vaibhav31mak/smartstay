# 🏠 SmartStay – Real Estate Property Management API

SmartStay is a Java Spring Boot RESTful backend API for managing real estate properties. It supports secure user authentication, property CRUD operations, property details, and bookmarking features for users (especially dealers).

## 🚀 Features

- 🔐 **Secure Authentication** with Spring Security + Basic Auth
- 🧑 **User Roles** – Admin, Dealer, Buyer
- 🏡 **Property CRUD** – Add, retrieve, and delete properties
- 📝 **Property Details** – Bedrooms, bathrooms, price, facilities
- ❤️ **Bookmark System** – Users can bookmark properties (Many-to-Many)
- 📦 Built using **Spring Boot + JPA + H2/MySQL**

## 🛠️ Tech Stack

| Layer        | Technology                     |
|--------------|--------------------------------|
| Backend      | Java Spring Boot               |
| Database     | MySQL (or H2)                  |
| ORM          | JPA + Hibernate                |
| Security     | Spring Security (Basic Auth)   |
| Build Tool   | Maven                          |
| API Test     | Postman                        |

## 📁 Project Structure

```
smartstay/
├── src/main/java/com/smartstay/
│   ├── Models/            # JPA entities (User, Property, PropertyDetails)
│   ├── Controllers/       # REST API endpoints
│   ├── Service/           # Business logic layer
│   ├── Repository/        # Spring Data JPA repositories
│   ├── Configrations/     # Spring Security configuration
│   └── Application.java   # Spring Boot entry point
├── src/main/resources/
│   ├── application.properties
│   └── data.sql
├── pom.xml
└── README.md
```
