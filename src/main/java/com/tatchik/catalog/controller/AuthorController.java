package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {

    private AuthorService authorService;


    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/author")
    public String getAllAuthor(ModelMap modelMap) {
        List<AuthorDto> authors = authorService.getAllAuthor();
        modelMap.addAttribute("authors", authors);
        return "authors";
    }

    @RequestMapping("/author/edit")
    public String editAuthor(ModelMap modelMap, @RequestParam Integer id) {
        AuthorDto authorDto = new AuthorDto();
        modelMap.addAttribute("author", authorDto);
        return "editAuthor";
    }

    @RequestMapping("/edit-author")
    public String saveAuthor(@ModelAttribute("author") AuthorDto authorDto){
        authorService.saveEntity(authorDto);
        return "redirect:/author";
    }



}


