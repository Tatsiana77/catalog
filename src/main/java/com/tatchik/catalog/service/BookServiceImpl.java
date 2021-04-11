package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public BookDto getAllBookWithAuthor() {
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
