package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.CustomerDto;

import java.util.List;

public interface CustmerService {

    public List<CustomerDto> getAllCustomer();

    public List<CustomerDto> getCustomerWithOrders();

}
