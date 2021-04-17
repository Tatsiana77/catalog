package com.tatchik.catalog.service;


import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.dto.IncomingDto;
import com.tatchik.catalog.dto.OrdersDto;
import com.tatchik.catalog.dto.SuppliersDto;
import com.tatchik.catalog.entity.Customer;
import com.tatchik.catalog.entity.Incoming;
import com.tatchik.catalog.entity.Orders;
import com.tatchik.catalog.entity.Suppliers;
import com.tatchik.catalog.repository.IncomingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class IncomingServiceImpl implements IncomingService {

    private IncomingRepository incomingRepository;

    @Autowired
    public IncomingServiceImpl(IncomingRepository incomingRepository) {
        this.incomingRepository = incomingRepository;
    }

    @Override
    public Set<IncomingDto> getAllIncoming() {
        return  null;
    }

    private Set<IncomingDto> convertFromIncomingListEntityToDtoList(Set<Incoming> incoming) {
        Set<IncomingDto> incomingDtos = new HashSet<>();
        for (Incoming incomings : incoming) {
            incomingDtos.add(convertFromEntityIncomingToDto(incomings));
        }

        return incomingDtos;
    }

    private IncomingDto convertFromEntityIncomingToDto(Incoming incoming) {
        IncomingDto incomingDto = new IncomingDto();
        incomingDto.setId(incoming.getId());
        incomingDto.setCount_Incom(incoming.getCount_Incom());
        incomingDto.setPrice(incoming.getPrice());
        incomingDto.setBook(new HashSet<>());
        incomingDto.setSuppliers(new HashSet<>());
        return incomingDto;
    }


    private Set<IncomingDto> FromIncomingListEntityToDtoList(Set<Incoming> incoming) {
        Set<IncomingDto> incomingDtos = new HashSet<>();
        for (Incoming incomings : incoming) {
            incomingDtos.add(FromEntityIncomingToDto(incomings));
        }

        return incomingDtos;
    }

    private IncomingDto FromEntityIncomingToDto(Incoming incoming) {
        IncomingDto incomingDto = new IncomingDto();
        incomingDto.setId(incoming.getId());
        incomingDto.setCount_Incom(incoming.getCount_Incom());
        incomingDto.setPrice(incoming.getPrice());

        Set<SuppliersDto> suppliersDtos = new HashSet<>();

        for (Suppliers suppliers : incoming.getSuppliers()) {
            SuppliersDto suppliersDto = new SuppliersDto();
            suppliersDto.setId(suppliers.getId());
            suppliersDto.setSuppliers_Name(suppliers.getSuppliers_Name());
            suppliersDto.setSuppliers_Phone(suppliers.getSuppliers_Phone());
            suppliersDtos.add(suppliersDto);
        }
        incomingDto.setSuppliersDto(suppliersDtos);
        return incomingDto;
    }

    private Incoming convertFromIncomingDtoToEntity(IncomingDto incomingDto) {
        Incoming incoming = new Incoming();
        if (incomingDto.getId() != null) {
            incoming.setId(incomingDto.getId());
        }
        incoming.setCount_Incom(incomingDto.getCount_Incom());
        incoming.setPrice(incomingDto.getPrice());
        incoming.setSuppliers(new HashSet<>());
        incoming.setBook(new HashSet<>());
        return  incoming;
    }

}
