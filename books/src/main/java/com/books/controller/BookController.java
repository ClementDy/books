package com.books.controller;

import com.books.entity.Book;
import com.books.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    BookRepository bookRepository;

    @GetMapping("books")
    public Iterable<Book> getBooks(){
        return bookRepository.findAll();
    }
}
