package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Publisher;
import com.tatchik.catalog.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    @Query("SELECT p FROM Publisher  p")
    List<Publisher> getAllPublisher();

    @Query("SELECT  DISTINCT  p  FROM Publisher p LEFT JOIN FETCH  p.books ")
    public List<Publisher> getAllPublisherWithBooks();

    @Query("SELECT   p FROM Publisher p  LEFT JOIN FETCH  p.books  WHERE  p.id = :id ")
    public Publisher  getPublisherWithBookById(@Param("id") Integer id);



}
