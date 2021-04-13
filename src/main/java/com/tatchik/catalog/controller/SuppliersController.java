package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.dto.SuppliersDto;
import com.tatchik.catalog.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@Controller
public class SuppliersController {

    private SuppliersService suppliersService;

    @Autowired
    public SuppliersController(SuppliersService suppliersService) {
        this.suppliersService = suppliersService;
    }

    @RequestMapping("/suppliers")
    public String getAllSuppliers(ModelMap modelMap) {
       Set<SuppliersDto> suppliers = suppliersService.getAllSuppliers();
        modelMap.addAttribute("publishers", suppliers);
        return "suppliers";
    }

    @RequestMapping("/suppliers/edit")
    public String editSuppliers(ModelMap modelMap, @RequestParam Integer id) {
        SuppliersDto suppliersDto= suppliersService.getSuppliersWithIncomingById(id);
        modelMap.addAttribute("suppliers", suppliersDto);
        return "editSuppliers";
    }
}
