package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustmerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customer = customerRepository.getAllCustomer();
        return convertFromCustomerListEntityToDtoList(customer);
    }

    private List<CustomerDto> convertFromCustomerListEntityToDtoList(List<Customer> customer) {
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customers : customer) {
            customerDtos.add(convertFromEntityCustomerToDto(customers));
        }

        return customerDtos;
    }

    private CustomerDto convertFromEntityCustomerToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
        customerDto.setCustomer_email(customer.getCustomer_email());
        customerDto.setCustomer_Address(customer.getCustomer_Address());
        customerDto.setCustomer_Phone(customer.getCustomer_Phone());
        return customerDto;
    }
}

