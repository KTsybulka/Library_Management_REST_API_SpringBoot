package com.example.n01561393_Assignment04_management_System.restController;


import com.example.n01561393_Assignment04_management_System.entity.Book;
import com.example.n01561393_Assignment04_management_System.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addNewBook(Book book){
        return new ResponseEntity<>(bookService.addNewBook(book), HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        return  new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Optional<Book> books = bookService.getBookById(id);
        if(books.isPresent()){
            return new ResponseEntity<>(books.get(), HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }


    @PutMapping("/books")
    public ResponseEntity<Book> updarteBook(@RequestBody Book book){
        Book updatedBook = bookService.upddateBook(book);
        if(!Objects.isNull(updatedBook)){
            return new ResponseEntity<>(updatedBook, HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    @DeleteMapping("/books/{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable Long id){
        boolean result = bookService.deleteBookById(id);
        if (result) {
            return ResponseEntity.noContent().build(); // Returns 204 No Content
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }
}
