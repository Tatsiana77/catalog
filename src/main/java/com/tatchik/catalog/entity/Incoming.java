package com.tatchik.catalog.entity;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
public class Incoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column
    Integer count_Incom;

    @Column
    DecimalFormat price;

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
}
