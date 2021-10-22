package com.example.demo.controller;

import com.example.demo.entity.Websites;
import com.example.demo.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/websites")
public class WebController {
    @Autowired
    private WebService webService;

    @RequestMapping("/getAllWebsites")
    public List<Websites> findAllWebsites(){
        return webService.findAllWebsites();
    }

    @RequestMapping("/getWebsitesById/{id}")
    public List<Websites> findWebsitesById(@PathVariable int id){
        return webService.findWebsitesByWebId(id);
    }
}
