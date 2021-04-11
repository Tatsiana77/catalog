package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Orders;
import com.tatchik.catalog.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    @Override
    @Transactional
    public List<CustomerDto> getCustomerWithOrders() {
        List<Customer>  customer = customerRepository.getCustomerWithOrders();
        return FromCustomerListEntityToDtoList(customer);
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


    private List<CustomerDto> FromCustomerListEntityToDtoList(List<Customer> customer) {
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customers : customer) {
            customerDtos.add(FromEntityCustomerToDto(customers));
        }

        return customerDtos;
    }

    private CustomerDto FromEntityCustomerToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
        customerDto.setCustomer_email(customer.getCustomer_email());
        customerDto.setCustomer_Address(customer.getCustomer_Address());
        customerDto.setCustomer_Phone(customer.getCustomer_Phone());

        List<OrdersDto> ordersDtos = new ArrayList<>();

        for(Orders orders: customer.getOrders() ){
            OrdersDto ordersDto = new OrdersDto();
            ordersDto.setId(orders.getId());
            ordersDto.setCountOrders(orders.getCountOrders());
            ordersDto.setDateOfOrder(orders.getDateOfOrder());
            ordersDtos.add(ordersDto);
        }
        customerDto.setOrdersDto(ordersDtos);
        return customerDto;
    }


}

