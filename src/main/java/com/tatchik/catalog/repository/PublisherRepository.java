package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Author;
import com.tatchik.catalog.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;


public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    @Query("SELECT p FROM Publisher  p")
    Set<Publisher> getAllPublisher();

    @Query("SELECT p FROM Publisher p WHERE p.name = :name")
    public Publisher getPublisherByName(@Param("name") String name);

    @Query("SELECT p FROM Publisher p where p.publisher_Address = :publisher_Address")
    public Publisher getPublisherByPublisherAddress(@Param("publisher_Address") String publisher_Address);

    @Query("SELECT  p FROM Publisher p LEFT JOIN FETCH p.book ")
    Set<Publisher> getAllPublisherWithJoin();
}
