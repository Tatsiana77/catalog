package com.tatchik.catalog.entity;


import jdk.jfr.DataAmount;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;




@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Integer id;

    @Column
   private String name;

    @Column
   private String publisher_Address;

    @Column
    @Temporal(TemporalType.DATE)
    private Date yearOfPub;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher", cascade = CascadeType.ALL)
    private List<Book> books;


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

    public String getPublisherAddress() {
        return publisher_Address;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisher_Address = publisher_Address;
    }

    public List<Book> getBooks() { return books; }

    public void setBooks(List<Book> books) { this.books = books; }

    public String getPublisher_Address() {

        return publisher_Address;
    }

    public void setPublisher_Address(String publisher_Address) {
        this.publisher_Address = publisher_Address;
    }

    public Date getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(Date yearOdPub) {
        this.yearOfPub = yearOdPub;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher_Address='" + publisher_Address + '\'' +
                ", yearOfPub=" + yearOfPub +
                ", books=" + books +
                '}';
    }


}
