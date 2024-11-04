package com.example.n01561393_Assignment04_management_System.service;

import com.example.n01561393_Assignment04_management_System.entity.Book;
import com.example.n01561393_Assignment04_management_System.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addNewBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        ArrayList<Book> books = new ArrayList<>();
//        for each element retrieved from findAll(), call the add method of books
//        with that element.
        bookRepository.findAll().forEach(books::add);
        return books;
    }


    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public Book upddateBook(Book book){
        Optional<Book> b = getBookById(book.getId());
        if(b.isPresent()){
            return bookRepository.save(book);
        }
        return null;
    }

    public boolean deleteBookById(Long id){
        Optional<Book> b = getBookById(id);
        if(b.isPresent()){
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
