package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface SuppliersRepository extends JpaRepository<Suppliers, Integer> {

    @Query("SELECT s FROM Suppliers s")
    public Set<Suppliers> getAllSuplliers();

    @Query("SELECT  DISTINCT  s FROM Suppliers s LEFT JOIN FETCH s.incoming ")
    public Set<Suppliers> getSuppliersWithJoin();
}
