package com.tatchik.catalog.restController;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/authorWithBooks")
    public List<AuthorDto> getAllAuthorWithBook() {
        return authorService.getAllAuthorWithBooks();
    }


    @GetMapping("api/author/{idAuthor}")
    public AuthorDto getAuthorById(@PathVariable("idAuthor") Integer id){
        return  authorService.getAuthorById(id);
    }

    @GetMapping("api/author/name")
    public AuthorDto getAuthorByName(@RequestParam String name){
        return authorService.getAuthorByName(name);
    }

    @PostMapping("/api/author")
    public void saveAuthor(@RequestBody AuthorDto authorDto){
        authorService.saveEntity(authorDto);
    }

    @DeleteMapping("api/author")
    public void deleteAuthorById(@PathVariable("idAuthor") Integer id){
         authorService.deleteById(id);

    }


}
