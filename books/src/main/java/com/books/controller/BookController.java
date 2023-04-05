package com.books.controller;

import com.books.entity.Book;
import com.books.exception.BookNotFoundException;
import com.books.repository.BookRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("books")
    public Iterable<Book> getBooks(){
        return bookRepository.findAll();
    }

    @PostMapping("book")
    public Book createBook(@RequestBody Book book){
        System.out.println(book.toString());
        return bookRepository.save(book);
    }

    @GetMapping("/book/{id}")
    Book getBook(@PathVariable Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()){
            return book.get();
        } else {
            new BookNotFoundException(id);
        }
        return null;
    }
}
