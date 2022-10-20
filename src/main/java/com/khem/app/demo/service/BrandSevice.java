package com.khem.app.demo.service;

import java.util.List;

import com.khem.app.demo.dto.BrandDTO;
import com.khem.app.demo.model.Brand;

public interface BrandSevice {
    Brand save(Brand entiry);
    Brand getId(Integer id);
    Brand update(Integer id, BrandDTO brandDTO);
    void delete(Integer id);
    
    List<Brand> getBrand();
}
