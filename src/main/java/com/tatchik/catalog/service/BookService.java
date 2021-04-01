package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.entity.Book;

import java.util.List;
import java.util.Set;

public interface BookService {

    List<BookDto> getAllBook();

    BookDto getAllBookWithAuthor();

    Set<BookDto> getAllBookWithPublisher();

    BookDto getBookByName(String name);

    public void saveEntity(BookDto bookDto);



}
