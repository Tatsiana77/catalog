package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Publisher;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class PublisherDto extends Publisher {
    private Integer id;
    private String name;
    private String publisher_Address;
    private Date yearOfPub;
    private Set<BookDto> bookDtoSet;


    public PublisherDto() {
    }

    public PublisherDto( String name ) {
        this.name = name;
    }

    public PublisherDto(Integer id, String name, String publisher_Address, Date yearOfPub, Set<BookDto> bookDtoSet) {
        this.id = id;
        this.name = name;
        this.publisher_Address = publisher_Address;
        this.yearOfPub = yearOfPub;
        this.bookDtoSet = bookDtoSet;
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

    public Set<BookDto> getBookDtoSet() {
        return bookDtoSet;
    }

    public void setBookDtoSet(Set<BookDto> bookDtoSet) {
        this.bookDtoSet = bookDtoSet;
    }

    @Override
    public String toString() {
        return "PublisherDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher_Address='" + publisher_Address + '\'' +
                ", yearOfPub=" + yearOfPub +
                ", bookDtoSet=" + bookDtoSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublisherDto)) return false;
        if (!super.equals(o)) return false;
        PublisherDto that = (PublisherDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName())
                && Objects.equals(getPublisher_Address(), that.getPublisher_Address())
                && Objects.equals(getYearOfPub(), that.getYearOfPub())
                && Objects.equals(getBookDtoSet(), that.getBookDtoSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getName(), getPublisher_Address(), getYearOfPub(), getBookDtoSet());
    }
}
