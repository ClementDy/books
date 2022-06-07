package com.books.controller;

import com.books.entity.Author;
import com.books.repository.AuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    AuthorRepository authorRepository;

    @GetMapping("/getAuthors")
    public Iterable<Author> getAuthors(){
        return authorRepository.findAll();
    }


}
