package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;

import java.util.List;

public class AuthorDto {
    private Integer id;
    private String name;
    private List<Book> book;

    public AuthorDto() {
    }

    public AuthorDto(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
