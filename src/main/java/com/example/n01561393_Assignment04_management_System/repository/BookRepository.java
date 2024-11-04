package com.example.n01561393_Assignment04_management_System.repository;

import com.example.n01561393_Assignment04_management_System.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.CachedRowSet;

@Repository
//Use CrudRepository for database operations.
public interface BookRepository extends CrudRepository <Book, Long> {

}


