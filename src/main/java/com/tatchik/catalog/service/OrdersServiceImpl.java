package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Orders;
import com.tatchik.catalog.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    private OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersDto> getAllOrders() {
        return convertListOrdersToListOrdersDto(ordersRepository.getAllOrders());
    }

    @Override
    public void saveEntity(OrdersDto ordersDto) {
        Orders order = convertFromOrdersDtoToEntity(ordersDto);
        ordersRepository.save(order);
    }

    private List<OrdersDto> convertListOrdersToListOrdersDto(List<Orders> order) {
        List<OrdersDto> ordersDtos = new ArrayList<>();
        for (Orders orders : order) {
            ordersDtos.add(convertFromEntityOrdersToDto(orders));
        }

        return ordersDtos;
    }

    private OrdersDto convertFromEntityOrdersToDto(Orders order) {
        OrdersDto ordersDto = new OrdersDto();
        ordersDto.setId(order.getId());
        ordersDto.setCountOrders(order.getCountOrders());
        ordersDto.setDateOfOrder(order.getDateOfOrder());

        return ordersDto;
    }

    private Orders convertFromOrdersDtoToEntity(OrdersDto ordersDto) {
        Orders order = new Orders();
        if (ordersDto.getId() != null) {
            order.setId(ordersDto.getId());
        }
        order.setCountOrders(ordersDto.getCountOrders());
        order.setDateOfOrder(ordersDto.getDateOfOrder());

        return order;

    }
}
