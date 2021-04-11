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
    private Customer customer;
    private Book book;

    public OrdersDto() {
    }

    public OrdersDto(Integer id, Integer countOrders, Date dateOfOrder, Customer customer, Book book) {
        this.id = id;
        this.countOrders = countOrders;
        this.dateOfOrder = dateOfOrder;
        this.customer = customer;
        this.book = book;
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
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Book getBook() {
        return book;
    }

    @Override
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "OrdersDto{" +
                "id=" + id +
                ", countOrders=" + countOrders +
                ", dateOfOrder=" + dateOfOrder +
                ", customer=" + customer +
                ", book=" + book +
                '}';
    }
}
