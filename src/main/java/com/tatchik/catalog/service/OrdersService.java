package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.entity.Orders;

import java.util.List;

public interface OrdersService {

    List<OrdersDto> getAllOrders();

    public void saveEntity(OrdersDto ordersDto);
}
