package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Publisher;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class PublisherDto extends Publisher {
    private Integer id;
    private String name;
    private String publisher_Address;
    private Date yearOfPub;
    private List<BookDto> bookDtoList;


    public PublisherDto() {
    }

    public PublisherDto(Integer id, String name, String publisher_Address, Date yearOfPub) {
        this.id = id;
        this.name = name;
        this.publisher_Address = publisher_Address;
        this.yearOfPub = yearOfPub;

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

    @Override
    public String getPublisher_Address() {
        return publisher_Address;
    }

    @Override
    public void setPublisher_Address(String publisher_Address) {
        this.publisher_Address = publisher_Address;
    }

    @Override
    public Date getYearOfPub() {
        return yearOfPub;
    }

    @Override
    public void setYearOfPub(Date yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public List<BookDto> getBookDtoList(List<BookDto> bookDtos) {
        return bookDtoList;
    }

    public void setBookDtoList(List<BookDto> bookDtoList) {
        this.bookDtoList = bookDtoList;
    }

    @Override
    public String toString() {
        return "PublisherDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher_Address='" + publisher_Address + '\'' +
                ", yearOfPub=" + yearOfPub +
                ", bookDtoList=" + bookDtoList +
                '}';
    }
}

