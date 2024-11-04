package com.example.n01561393_Assignment04_management_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.sql.Update;

import java.time.LocalDateTime;

//Use Lombok to reduce boilerplate code by using @Data,
// @AllArgsConstructor, @NoArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String author;
    private String subject;

    @CreationTimestamp // This field will automatically be set to the current date and time
    private LocalDateTime createTimestamp;

    @UpdateTimestamp // This field will automatically be set to the current date and time
    private LocalDateTime updateTimestamp;
}
