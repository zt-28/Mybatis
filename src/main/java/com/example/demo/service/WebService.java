package com.example.demo.service;

import com.example.demo.entity.Websites;
import com.example.demo.mapper.WebMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {
    @Autowired(required = false)
    public WebMapper webMapper;

    public List<Websites> findAllWebsites(){
        return webMapper.findAllWebsites();
    }

    public List<Websites> findWebsitesByWebId(int id){
        return webMapper.findWebsitesById(id);
    }
}
