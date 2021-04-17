package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers, Integer> {

    @Query("SELECT s FROM Suppliers s")
    public Set<Suppliers> getAllSuppliers();

    @Query("SELECT DISTINCT s FROM Suppliers s LEFT JOIN FETCH s.incoming ")
    public Set<Suppliers> getSuppliersWithJoin();

    @Query("SELECT  s FROM Suppliers s LEFT JOIN FETCH  s.incoming  WHERE  s.id = :id ")
    public Suppliers getSuppliersWithIncomingById(@Param("id") Integer id);
}
