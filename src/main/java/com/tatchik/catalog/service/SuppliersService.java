package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.SuppliersDto;

import java.util.Set;

public interface SuppliersService {

    public Set<SuppliersDto> getAllSuppliers();

    public Set<SuppliersDto> getSuppliersWithJoin();
}
