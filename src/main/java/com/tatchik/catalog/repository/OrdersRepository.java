package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    @Query("SELECT  o FROM Orders  o")
    public List<Orders> getAllOrders();

}
