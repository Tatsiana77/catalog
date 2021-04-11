package com.tatchik.catalog.service;



import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.IncomingDto;
import com.tatchik.catalog.dto.SuppliersDto;
import com.tatchik.catalog.entity.Book;
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
        Set<Suppliers> suppliers = suppliersRepository.getAllSuplliers();
        return convertFromSetEntityToDtoSet(suppliers);
    }

    @Override
    @Transactional
    public Set<SuppliersDto> getSuppliersWithJoin() {
        Set<Suppliers> suppliers = suppliersRepository.getSuppliersWithJoin();
        return convertFromSetEntityToDtoSet(suppliers);
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

        for(Incoming incoming : suppliers.getIncoming()){
            IncomingDto incomingDto = new IncomingDto();
            incomingDto.setId(incoming.getId());
            incomingDto.setCount_Incom(incoming.getCount_Incom());
            incomingDto.setPrice(incoming.getPrice());
            incomingDto.setBook(new HashSet<>());
            incomingDtos.add(incomingDto);
        }

            suppliersDto.setIncomingDto(incomingDtos);
        return suppliersDto;
    }


}

