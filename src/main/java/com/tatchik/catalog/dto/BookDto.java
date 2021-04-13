package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Publisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class BookDto extends Book {
    private Integer id;
    private String name;
    private Set<BookDto> bookDto;


    public BookDto() {
    }

    public BookDto(Integer id, String name, Set<BookDto> bookDto) {
        this.id = id;
        this.name = name;
        this.bookDto = bookDto;
    }

    public BookDto(Integer id, String name) {
        this.id = id;
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

    public Set<BookDto> getBookDto() {
        return bookDto;
    }

    public void setBookDto(Set<BookDto> bookDto) {
        this.bookDto = bookDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto)) return false;
        if (!super.equals(o)) return false;
        BookDto bookDto1 = (BookDto) o;
        return Objects.equals(getId(), bookDto1.getId()) && Objects.equals(getName(), bookDto1.getName()) && Objects.equals(getBookDto(), bookDto1.getBookDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getName(), getBookDto());
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookDto=" + bookDto +
                '}';
    }
}
