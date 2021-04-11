package com.tatchik.catalog.restController;



import com.tatchik.catalog.dto.SuppliersDto;
import com.tatchik.catalog.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class SuppliersController {

    private SuppliersService suppliersService;

    @Autowired
    public SuppliersController(SuppliersService suppliersService) {
        this.suppliersService = suppliersService;
    }

    @GetMapping("api/suppliers")
    public Set<SuppliersDto> getAllSuppliers(){
        return suppliersService.getAllSuppliers();
    }

    @GetMapping("api/suppliersWithIncoming")
    public Set<SuppliersDto> getSuppliersWithJoin(){
        return suppliersService.getSuppliersWithJoin();
    }
}
