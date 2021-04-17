package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c")
    public List<Customer> getAllCustomer();

    @Query("SELECT DISTINCT c FROM Customer c LEFT JOIN FETCH c.orders")
    public List<Customer> getCustomerWithOrders();


    @Query("SELECT  c FROM Customer c LEFT JOIN FETCH c.orders  WHERE  c.id = :id ")
    public Customer  getCustomerWithOrdersById(@Param("id") Integer id);

}
