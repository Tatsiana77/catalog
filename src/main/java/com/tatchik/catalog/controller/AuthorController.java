package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping("/authors")
    public String getAllAuthor(ModelMap modelMap) {
        List<AuthorDto> authors = authorService.getAllAuthor();
        modelMap.addAttribute("authors", authors);
        return "author";
    }

    @RequestMapping(value = "/authors/books")
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

    @RequestMapping("/edit-author")
    public String saveAuthor(@ModelAttribute("author") AuthorDto authorDto) {
        authorService.saveEntity(authorDto);
        return "redirect:/author";
    }

}
