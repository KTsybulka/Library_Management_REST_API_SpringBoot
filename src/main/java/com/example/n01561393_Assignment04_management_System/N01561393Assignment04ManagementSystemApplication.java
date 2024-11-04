package com.example.n01561393_Assignment04_management_System;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication


//OpenAPI provides a clear way to describe the API, making it easier to use,
// and the dependency helps automatically generate that description for the
// Java Spring applications. This makes the API more user-friendly for other developers!
@OpenAPIDefinition(info = @Info(title = "Library Management System API",
		version = "1.0",
		description = "API for managing library books, including endpoints to add, retrieve, update, and delete books."))

public class N01561393Assignment04ManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(N01561393Assignment04ManagementSystemApplication.class, args);
	}

}
