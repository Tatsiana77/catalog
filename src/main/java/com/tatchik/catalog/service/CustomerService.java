package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.dto.OrdersDto;

import java.util.List;

public interface CustomerService {

    public List<CustomerDto> getAllCustomer();

    public List<CustomerDto> getCustomerWithOrders();

    public void saveEntity(CustomerDto customerDto);

    public  CustomerDto getOrdersByCustomer(Integer idCustomer);

    public CustomerDto getCustomerById(Integer idCustomer);

}
