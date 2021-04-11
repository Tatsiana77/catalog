package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c")
    public List<Customer> getAllCustomer();
}
