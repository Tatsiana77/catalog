package com.tatchik.catalog.repository;

import com.tatchik.catalog.entity.Incoming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomingRepository extends JpaRepository<Incoming, Integer> {



}
