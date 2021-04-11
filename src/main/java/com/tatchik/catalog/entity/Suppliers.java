package com.tatchik.catalog.entity;

import com.tatchik.catalog.dto.IncomingDto;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String suppliers_Name;

    @Column
    private String suppliers_Phone;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "suppliers_incoming",
            joinColumns = @JoinColumn(name = "suppliers_id"),
            inverseJoinColumns = @JoinColumn(name = "incoming_id"))
    private Set<Incoming> incoming;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliers_Name() {
        return suppliers_Name;
    }

    public void setSuppliers_Name(String suppliers_Name) {
        this.suppliers_Name = suppliers_Name;
    }

    public String getSuppliers_Phone() {
        return suppliers_Phone;
    }

    public void setSuppliers_Phone(String suppliers_Phone) {
        this.suppliers_Phone = suppliers_Phone;
    }

    public Set<Incoming> getIncoming() {
        return incoming;
    }

    public void setIncoming(Set<Incoming> incoming) {
        this.incoming = incoming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suppliers)) return false;
        Suppliers suppliers = (Suppliers) o;
        return Objects.equals(getId(), suppliers.getId()) && Objects.equals(getSuppliers_Name(), suppliers.getSuppliers_Name())
                && Objects.equals(getSuppliers_Phone(), suppliers.getSuppliers_Phone())
                && Objects.equals(getIncoming(), suppliers.getIncoming());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSuppliers_Name(), getSuppliers_Phone(), getIncoming());
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "id=" + id +
                ", suppliers_Name='" + suppliers_Name + '\'' +
                ", suppliers_Phone='" + suppliers_Phone + '\'' +
                ", incoming=" + incoming +
                '}';
    }
}





