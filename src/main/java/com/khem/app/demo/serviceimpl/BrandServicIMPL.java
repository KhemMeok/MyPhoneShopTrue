package com.khem.app.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.khem.app.demo.dto.BrandDTO;
import com.khem.app.demo.model.Brand;
import com.khem.app.demo.repository.BrandRepository;
import com.khem.app.demo.service.BrandSevice;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class BrandServicIMPL implements BrandSevice {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand save(Brand entiry) {

        return brandRepository.save(entiry);
    }

    @Override
    public Brand getId(Integer id) {
        
         Optional<Brand> findById = brandRepository.findById(id);
         if(findById.isPresent()) {
             return findById.get();
             
         }
         else {
             throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("brand not found for id=%d", id));
         }
          
    }

    @Override
    public Brand update(Integer id, BrandDTO brandDTO) {
       Brand brand = getId(id);
       brand.setName(brandDTO.getName());
         return  brandRepository.save(brand);
     
    }

    @Override
    public void delete(Integer id) {
        Brand brand = getId(id);
        brandRepository.delete(brand);
        log.info("brand with id = %d is deleted".formatted(id));
    }

    @Override
    public List<Brand> getBrand() {
         return brandRepository.findAll();
      
    }

}
