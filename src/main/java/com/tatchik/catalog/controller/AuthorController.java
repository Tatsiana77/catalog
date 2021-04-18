package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping(value="/authors", method = RequestMethod.GET)
    public String getAllAuthor(ModelMap modelMap) {
        List<AuthorDto> authors = authorService.getAllAuthor();
        modelMap.addAttribute("authors", authors);
        return "author";
    }

    @RequestMapping( "/authors/books")
    public String getAllBook(ModelMap modelMap, @RequestParam Integer id) {
        AuthorDto authorDto = authorService.getAuthorWithBookById(id);
        modelMap.addAttribute("authors", authorDto);
        return "book";
    }

    @RequestMapping("/author/edit")
    public String editAuthor(ModelMap modelMap, @RequestParam Integer id) {
        AuthorDto authorDto = authorService.getAuthorById(id);
        modelMap.addAttribute("author", authorDto);
        return "editAuthor";
    }

    @RequestMapping(value="/edit-author", method =RequestMethod.POST)
    public String saveAuthor(@ModelAttribute("author") AuthorDto authorDto) {
        authorService.saveEntity(authorDto);
        return "redirect:/author";
    }
    @RequestMapping("/author/{id}")
    public String deleteAuthor(ModelMap modelMap, @RequestParam Integer id){
       authorService.deleteById(id);
       return  "deleteAuthor";
    }

}
