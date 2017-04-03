package com.example.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @GetMapping
    public Book getAll() {
        Book b = new Book();
        b.setBookname("Library");
        return new Book();
    }
}

git