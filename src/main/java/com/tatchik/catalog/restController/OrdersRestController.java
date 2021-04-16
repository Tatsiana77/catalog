package com.tatchik.catalog.restController;


import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersRestController {

    private OrdersService ordersService;

    @Autowired
    public OrdersRestController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/api/orders")
    public List<OrdersDto> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @PostMapping("/api/orders")
    public void saveOrders(@RequestBody OrdersDto ordersDto) {
        ordersService.saveEntity(ordersDto);
    }
}
