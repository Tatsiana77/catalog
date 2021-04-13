package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }


    @Override
    public List<BookDto> getAllBook() {
        return null;
    }

    @Override
    public List<BookDto> getAllBookWithJoin() {
        return null;
    }



    @Override
    public BookDto getBookByName(String name) {
        return null;
    }

    @Override
    public void saveEntity(BookDto bookDto) {

    }
}
