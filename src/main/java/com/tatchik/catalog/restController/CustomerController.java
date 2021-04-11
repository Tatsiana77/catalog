package com.tatchik.catalog.restController;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.service.CustmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustmerService custmerService;

    @Autowired
    public CustomerController(CustmerService custmerService) {
        this.custmerService = custmerService;
    }

    @GetMapping("/api/customer")
    public List<CustomerDto> getAllCustomer() {
        return custmerService.getAllCustomer();
    }
}
