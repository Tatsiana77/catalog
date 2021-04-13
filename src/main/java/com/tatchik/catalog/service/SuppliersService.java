package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.dto.SuppliersDto;

import java.util.Set;

public interface SuppliersService {

    public Set<SuppliersDto> getAllSuppliers();

    public Set<SuppliersDto> getSuppliersWithJoin();

    public void saveEntity(SuppliersDto suppliersDto);

    public SuppliersDto  getSuppliersWithIncomingById(Integer idSuppliers);
}
