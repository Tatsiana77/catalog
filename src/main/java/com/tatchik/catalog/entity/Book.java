package com.tatchik.catalog.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="author_id", nullable = false)
    private Author author;


    @ManyToMany(mappedBy = "book")
    Set<Publisher> publisherSet;

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Publisher> getPublisherSet() {
        return publisherSet;
   }

    public void setPublisherSet(Set<Publisher> publisherSet) {
        this.publisherSet = publisherSet;
   }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", publisherSet=" + publisherSet +
                '}';
    }


}
