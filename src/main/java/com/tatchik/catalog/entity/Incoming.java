package com.tatchik.catalog.entity;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Set;

@Entity
public class Incoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name="count_Incom")
    private Integer count_Incom;

    @Column(name="price")
    private DecimalFormat price;

    @ManyToMany(mappedBy = "incoming")
    private Set<Suppliers> suppliers;


    @ManyToMany(mappedBy = "incoming")
    private Set<Book> book;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount_Incom() {
        return count_Incom;
    }

    public void setCount_Incom(Integer count_Incom) {
        this.count_Incom = count_Incom;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public Set<Suppliers> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Suppliers> suppliers) {
        this.suppliers = suppliers;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Incoming)) return false;

        Incoming incoming = (Incoming) o;

        if (!getId().equals(incoming.getId())) return false;
        if (!getCount_Incom().equals(incoming.getCount_Incom())) return false;
        if (!getPrice().equals(incoming.getPrice())) return false;
        if (!getSuppliers().equals(incoming.getSuppliers())) return false;
        return getBook().equals(incoming.getBook());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getCount_Incom().hashCode();
        result = 31 * result + getPrice().hashCode();
        result = 31 * result + getSuppliers().hashCode();
        result = 31 * result + getBook().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Incoming{" +
                "id=" + id +
                ", count_Incom=" + count_Incom +
                ", price=" + price +
                ", suppliers=" + suppliers +
                ", book=" + book +
                '}';
    }
}
