package com.tatchik.catalog.restController;

import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
//
//    private CustomerService custmerService;
//
//    @Autowired
//    public CustomerController(CustomerService custmerService) {
//        this.custmerService = custmerService;
//    }
//
//    @GetMapping("/api/customer")
//    public List<CustomerDto> getAllCustomer() {
//        return custmerService.getAllCustomer();
//    }
//
//    @GetMapping("/api/customerWithOrders")
//    public List<CustomerDto>  getCustomerWithOrders(){
//        return custmerService.getCustomerWithOrders();
//    }
}
