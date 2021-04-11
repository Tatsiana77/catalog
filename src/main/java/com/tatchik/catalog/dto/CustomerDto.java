package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Orders;

import java.util.List;

public class CustomerDto extends Customer {

    private Integer id;
    private String name;
    private String surname;
    private String customer_Address;
    private String customer_Phone;
    private String customer_email;
    private List<OrdersDto> ordersDto;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, String name, String surname, String customer_Address,
                       String customer_Phone, String customer_email, List<OrdersDto> ordersDto) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.customer_Address = customer_Address;
        this.customer_Phone = customer_Phone;
        this.customer_email = customer_email;
        this.ordersDto = ordersDto;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getCustomer_Address() {
        return customer_Address;
    }

    @Override
    public void setCustomer_Address(String customer_Address) {
        this.customer_Address = customer_Address;
    }

    @Override
    public String getCustomer_Phone() {
        return customer_Phone;
    }

    @Override
    public void setCustomer_Phone(String customer_Phone) {
        this.customer_Phone = customer_Phone;
    }

    @Override
    public String getCustomer_email() {
        return customer_email;
    }

    @Override
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public List<OrdersDto> getOrdersDto() {
        return ordersDto;
    }

    public void setOrdersDto(List<OrdersDto> ordersDto) {
        this.ordersDto = ordersDto;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", customer_Address='" + customer_Address + '\'' +
                ", customer_Phone='" + customer_Phone + '\'' +
                ", customer_email='" + customer_email + '\'' +
                ", ordersDto=" + ordersDto +
                '}';
    }
}
