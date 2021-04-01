package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {


    @Autowired
    private BookService bookService;

    @RequestMapping("/book")
    public String getAllBook(ModelMap modelMap) {
        List<BookDto> books = bookService.getAllBook();
        modelMap.addAttribute("authors", books);
        return "books";
    }
}