package com.example.demo.mapper;

import com.example.demo.entity.Websites;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface WebMapper {

    @Mapper
    public List<Websites> findAllWebsites();
    public List<Websites> findWebsitesById(int id);
}
