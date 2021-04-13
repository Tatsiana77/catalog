package com.tatchik.catalog.controller;

import com.tatchik.catalog.dto.AuthorDto;
import com.tatchik.catalog.dto.CustomerDto;
import com.tatchik.catalog.dto.PublisherDto;
import com.tatchik.catalog.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@Controller
public class PublisherController {

     private PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/publisher")
    public String getAllPublisher(ModelMap modelMap) {
    List<PublisherDto> publishers = publisherService.getAllPublisher();
        modelMap.addAttribute("publishers", publishers);
        return "publishers";
    }

    @RequestMapping("/publisher/edit")
    public String editPublisher(ModelMap modelMap, @RequestParam Integer id) {
       PublisherDto publisherDto= publisherService.getPublisherWithBookById(id);
        modelMap.addAttribute("publisher", publisherDto);
        return "editPublisher";
    }

}
