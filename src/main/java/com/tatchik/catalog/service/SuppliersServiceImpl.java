package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.IncomingDto;
import com.tatchik.catalog.dto.SuppliersDto;
import com.tatchik.catalog.entity.Incoming;
import com.tatchik.catalog.entity.Suppliers;
import com.tatchik.catalog.repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class SuppliersServiceImpl implements SuppliersService {

    private SuppliersRepository suppliersRepository;

    @Autowired
    public SuppliersServiceImpl(SuppliersRepository suppliersRepository) {
        this.suppliersRepository = suppliersRepository;
    }

    @Override
    @Transactional
    public Set<SuppliersDto> getAllSuppliers() {
        Set<Suppliers> suppliers = suppliersRepository.getAllSuppliers();
        return FromSuppliersSetEntityToDto(suppliers);
    }

    @Override
    public Set<SuppliersDto> getSuppliersWithJoin() {
        Set<Suppliers> suppliers = suppliersRepository.getSuppliersWithJoin();
        return convertFromSetEntityToDtoSet(suppliers);
    }

    @Override
    public void saveEntity(SuppliersDto suppliersDto) {
        Suppliers suppliers = convertFromSuppliersDtoToEntity(suppliersDto);
        suppliersRepository.save(suppliers);
    }

    @Override
    public SuppliersDto getSuppliersWithIncomingById(Integer idSuppliers) {
        return convertFromEntityToDto( suppliersRepository.getSuppliersWithIncomingById(idSuppliers));
    }


    private Set<SuppliersDto> convertFromSetEntityToDtoSet(Set<Suppliers> suppliers) {
        Set<SuppliersDto> suppliersDtos = new HashSet<>();
        for (Suppliers supplier : suppliers) {
            suppliersDtos.add(convertFromEntityToDto(supplier));
        }

        return suppliersDtos;
    }

    private SuppliersDto convertFromEntityToDto(Suppliers suppliers) {
        SuppliersDto suppliersDto = new SuppliersDto();
        suppliersDto.setId(suppliers.getId());
        suppliersDto.setSuppliers_Name(suppliers.getSuppliers_Name());
        suppliersDto.setSuppliers_Phone(suppliers.getSuppliers_Phone());

        Set<IncomingDto> incomingDtos = new HashSet<>();

        for (Incoming incoming : suppliers.getIncoming()) {
            IncomingDto incomingDto = new IncomingDto();
            incomingDto.setId(incoming.getId());
            incomingDto.setCount_Incom(incoming.getCount_Incom());
            incomingDto.setPrice(incoming.getPrice());
            incomingDtos.add(incomingDto);
        }

        suppliersDto.setIncomingDto(incomingDtos);
        return suppliersDto;
    }


    private Set<SuppliersDto> FromSuppliersSetEntityToDto(Set<Suppliers> suppliers) {
        Set<SuppliersDto> suppliersDtos = new HashSet<>();
        for (Suppliers supplier : suppliers) {
            suppliersDtos.add(FromSuppliersEntityToDto(supplier));
        }

        return suppliersDtos;
    }

    private SuppliersDto FromSuppliersEntityToDto(Suppliers suppliers) {
        SuppliersDto suppliersDto = new SuppliersDto();
        suppliersDto.setId(suppliers.getId());
        suppliersDto.setSuppliers_Name(suppliers.getSuppliers_Name());
        suppliersDto.setSuppliers_Phone(suppliers.getSuppliers_Phone());
        suppliersDto.setIncomingDto(new HashSet<>());
        return suppliersDto;
    }

    private Suppliers convertFromSuppliersDtoToEntity(SuppliersDto suppliersDto) {
        Suppliers suppliers = new Suppliers();
        if (suppliersDto.getId() != null) {
            suppliers.setId(suppliersDto.getId());
        }
        suppliers.setSuppliers_Name(suppliersDto.getSuppliers_Name());
        suppliers.setSuppliers_Phone(suppliersDto.getSuppliers_Phone());
        suppliers.setIncoming(new HashSet<>());
        return suppliers;
    }


}

