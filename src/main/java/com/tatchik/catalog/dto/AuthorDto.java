package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Author;

import java.util.List;

public class AuthorDto extends Author {
    private Integer id;
    private String name;
    private List<BookDto> bookDto;

    public AuthorDto() {
    }

    public AuthorDto(String name) {
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<BookDto> getBookDto() {
        return bookDto;
    }

    public void setBookDto(List<BookDto> bookDto) {
        this.bookDto = bookDto;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookDto=" + bookDto +
                '}';
    }
}
