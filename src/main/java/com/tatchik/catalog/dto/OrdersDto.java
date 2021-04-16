package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Orders;

import javax.persistence.*;
import java.util.Date;

public class OrdersDto extends Orders {
    private Integer id;
    private Integer countOrders;
    private Date dateOfOrder;


    public OrdersDto() {
    }

    public OrdersDto(Integer id, Integer countOrders, Date dateOfOrder) {
        this.id = id;
        this.countOrders = countOrders;
        this.dateOfOrder = dateOfOrder;

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
    public Integer getCountOrders() {
        return countOrders;
    }

    @Override
    public void setCountOrders(Integer countOrders) {
        this.countOrders = countOrders;
    }

    @Override
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }



    @Override
    public String toString() {
        return "OrdersDto{" +
                "id=" + id +
                ", countOrders=" + countOrders +
                ", dateOfOrder=" + dateOfOrder +
                '}';
    }


}
