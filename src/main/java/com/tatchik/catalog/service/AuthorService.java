package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.entity.Author;

import java.util.List;

public interface AuthorService {

    public List<AuthorDto> getAllAuthor();
    public List<AuthorDto> getAllAuthorWithJoin();
    public void saveEntity(AuthorDto authorDto);
}
