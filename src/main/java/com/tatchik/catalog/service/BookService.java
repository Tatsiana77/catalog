package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.BookDto;

import java.util.List;

public interface BookService {

    List<BookDto> getAllBook();

    BookDto getAllBookWithAuthor();


    BookDto getBookByName(String name);

    public void saveEntity(BookDto bookDto);



}
