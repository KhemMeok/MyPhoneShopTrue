package com.khem.app.demo.mapper;

import com.khem.app.demo.dto.BrandDTO;
import com.khem.app.demo.model.Brand;

public class EntiryMapper {
    public static Brand toBrand(BrandDTO brandDTO){
        Brand brand = new Brand();
        brand.setName(brandDTO.getName());
        return brand;
    }
    public static BrandDTO toBrandDTO(Brand entiry){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(entiry.getName());
        return brandDTO;
    }
}
