package com.tatchik.catalog.entity;

import javax.persistence.*;

@Entity
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String  suppliers_Name;

    @Column
     String suppliers_Phone;

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
}

