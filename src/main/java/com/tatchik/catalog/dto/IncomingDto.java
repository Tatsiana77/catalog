package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Incoming;
import com.tatchik.catalog.entity.Suppliers;

import java.text.DecimalFormat;
import java.util.Set;

public class IncomingDto extends Incoming {

    private Integer id;
    private Integer count_Incom;
    private DecimalFormat price;


    public IncomingDto() {
    }

    public IncomingDto(Integer id, Integer count_Incom, DecimalFormat price) {
        this.id = id;
        this.count_Incom = count_Incom;
        this.price = price;

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
    public Integer getCount_Incom() {
        return count_Incom;
    }

    @Override
    public void setCount_Incom(Integer count_Incom) {
        this.count_Incom = count_Incom;
    }

    @Override
    public DecimalFormat getPrice() {
        return price;
    }

    @Override
    public void setPrice(DecimalFormat price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "IncomingDto{" +
                "id=" + id +
                ", count_Incom=" + count_Incom +
                ", price=" + price +
                '}';
    }
}
