package com.tatchik.catalog.restController;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorRestController {

    private AuthorService authorService;

    @Autowired
    public AuthorRestController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("/api/author")
    public List<AuthorDto> getAllAuthor() {
        return authorService.getAllAuthor();
    }

    @GetMapping("/api/book")
    public List<AuthorDto> getAllAuthorWithBook() {
        return authorService.getAllAuthorWithBooks();
    }


}
