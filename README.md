# Contact Management API

This project is a Spring Boot-based Contact Management API. It provides a RESTful service for managing contacts, including functionalities to create, update, retrieve, and delete contact information.

## Features

- **CRUD Operations**: Create, Read, Update, and Delete contacts.
- **Spring Boot**: Built using the Spring Boot framework.
- **Maven**: Uses Maven for build automation and dependency management.
- **Spring Data JPA**: Simplified data access with Spring Data repositories.

## Project Structure

```plaintext
ContactManagement/
├── src
│   ├── main
│   │   ├── java
│   │   │   └── dev.project.ContactManagement
│   │   │       ├── ContactManagementApplication.java      # Main application entry point
│   │   │       ├── controllers
│   │   │       │   └── ContactController.java             # Handles API requests
│   │   │       ├── dao
│   │   │       │   └── ContactDao.java                    # Data access object
│   │   │       ├── entities
│   │   │       │   └── Contact.java                       # Contact entity definition
│   │   │       ├── repositories
│   │   │       │   └── ContactRepository.java             # JPA repository
│   │   │       └── services
│   │   │           └── ContactServices.java               # Business logic layer
│   │   └── resources
│   │       └── application.properties                      # Spring Boot configuration
│   └── test
│       └── java
│           └── dev.project.ContactManagement
│               └── ContactManagementApplicationTests.java  # Unit tests
├── pom.xml                                                 # Maven configuration
├── README.md                                               # Project documentation
└── mvnw, mvnw.cmd                                          # Maven wrapper scripts
```

## Requirements

- **Java**: JDK 17 or higher
- **Maven**: 3.8 or higher

## Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd ContactManagement
   ```

2. **Build the project:**
   Use the Maven wrapper script to build the project:
   ```bash
   ./mvnw clean install
   ```
   (On Windows, use `mvnw.cmd` instead.)

3. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```
   The application will start on `http://localhost:8080` by default.

4. **Access the API:**
   Use a tool like Postman or cURL to interact with the API endpoints:
   - `GET /api/contacts` – Retrieve all contacts
   - `POST /api/contacts` – Add a new contact
   - `PUT /api/contacts/{id}` – Update an existing contact
   - `DELETE /api/contacts/{id}` – Delete a contact

## Configuration

The application uses the `application.properties` file for configuration. You can modify the following properties as needed:

```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/contact_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

## Dependencies

- **Spring Boot Starter Web** – To create RESTful APIs
- **Spring Boot Starter Data JPA** – For data access using JPA
- **H2 Database** – In-memory database for testing (can be replaced with MySQL or other DBMS)
- **Spring Boot Starter Test** – For unit testing

## Testing

To run the tests, use the following command:
```bash
./mvnw test
```


