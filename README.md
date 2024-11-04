# Library Management System REST API (Spring Boot)

This project is a REST API for managing a library's collection of books. The API allows for CRUD operations (Create, Read, Update, Delete) on books within the library. This system is built using **Spring Boot** and **MySQL** as the database, with **Swagger** integrated for API documentation.

## Assignment Overview

### Objectives
1. Develop a REST API for a Library Management System.
2. Manage books with the following attributes:
   - **Id**: Unique identifier (auto-incremented)
   - **Name**: Book name
   - **Location**: Physical location in the library
   - **Author**: Book author
   - **Subject**: Subject category of the book
   - **Create Timestamp**: Date and time the book was added
   - **Update Timestamp**: Date and time the book information was last updated

3. Implement the following endpoints:
   - **addNewBook**: Add a new book to the library
   - **getAllBooks**: Retrieve a list of all books
   - **getBookByID**: Retrieve a single book by its ID
   - **updateBook**: Update an existing book's information
   - **deleteBookById**: Delete a book by its ID

### Technologies and Libraries
- **Spring Boot**: For building and running the REST API
- **MySQL**: Database for storing book data
- **Lombok**: To reduce boilerplate code in Java
- **CrudRepository**: For database operations
- **Swagger**: For API documentation and testing

## Project Structure
This project is organized into the following layers:

- **Controller**: Manages the incoming API requests.
- **Entity**: Represents the book data structure.
- **Service**: Contains business logic for managing books.
- **Repository**: Interfaces with the database using Spring's `CrudRepository`.

## Features
- **Timestamps**: 
  - `createTimestamp` and `updateTimestamp` fields are automatically set with the current date and time.
  - Every time a book is added, both timestamps are updated.
  - On update operations, only `updateTimestamp` is modified.
- **Optional Class**: Used for handling nullable responses and preventing `NullPointerException`.
- **Proper HTTP Response Codes**: Ensures appropriate response codes using `ResponseEntity`.

## Installation and Setup
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/KTsybulka/Library_Management_REST_API_SpringBoot.git
