package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    public List<AuthorDto> getAllAuthor();

    public List<AuthorDto> getAllAuthorWithBooks();

    AuthorDto getAuthorByName(String name);

    public void saveEntity(AuthorDto authorDto);

    public AuthorDto getAuthorById(Integer idAuthor);


}
