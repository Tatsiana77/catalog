package com.tatchik.catalog.restController;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController {

    private BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/books")
    public List<BookDto> getAllBook() {
        return bookService.getAllBook();
    }

    @GetMapping("/api/bookWithOrders")
    public List<BookDto> getAllBookWithOrders() {
        return bookService.getAllBookWithOrders();
    }


    @PostMapping("api/books")
    public void saveBook(@RequestBody BookDto bookDto) {
        bookService.saveEntity(bookDto);
    }


}
