package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
public class PublisherController {

     @Autowired
     private PublisherService publisherService;

    @RequestMapping("/publisher")
    public String getAllPublisher(ModelMap modelMap) {
        Set<PublisherDto> publishers = publisherService.getAllPublisher();
        modelMap.addAttribute("publishers", publishers);
        return "publishers";
    }
}
