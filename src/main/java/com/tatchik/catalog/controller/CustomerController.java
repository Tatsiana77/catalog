package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {


    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public String getAllCustomer(ModelMap modelmap) {
        List<CustomerDto> customers = customerService.getAllCustomer();
        modelmap.addAttribute("customers", customers);
        return "customers";
    }

    @RequestMapping("/customers/orders")
    public String getAllOrders(ModelMap modelMap, @RequestParam Integer id) {
        CustomerDto customerDto = customerService.getOrdersByCustomer(id);
        modelMap.addAttribute("customers", customerDto);
        return "orders";
    }

    @RequestMapping("/customer/edit")
    public String editCustomer(ModelMap modelMap, @RequestParam Integer id) {
        CustomerDto customerDto = customerService.getCustomerById(id);
        modelMap.addAttribute("customer", customerDto);
        return "editCustomer";
    }

    @RequestMapping("edit-customer")
    public String  saveCustomer(@ModelAttribute ("customer" ) CustomerDto customerDto){
        customerService.saveEntity(customerDto);
        return "redirect:/customers";
    }
}
