package com.tatchik.catalog.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @Column
    String publisher_Address;

    @Column
    @Temporal(TemporalType.DATE)
    Date yearOfPub;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "publisher_book",
            joinColumns = @JoinColumn(name = "publisher_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    Set<Book> book;


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

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }

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
                ", book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(getId(), publisher.getId()) && Objects.equals(getName(), publisher.getName())
                && Objects.equals(getPublisher_Address(), publisher.getPublisher_Address())
                && Objects.equals(getYearOfPub(), publisher.getYearOfPub())
                && Objects.equals(getBook(), publisher.getBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPublisher_Address(),getYearOfPub(), getBook());
    }
}
