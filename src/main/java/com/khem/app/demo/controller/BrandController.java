package com.khem.app.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khem.app.demo.dto.BrandDTO;
import com.khem.app.demo.mapper.EntiryMapper;
import com.khem.app.demo.model.Brand;
import com.khem.app.demo.service.BrandSevice;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandSevice brandSevice;

    @PostMapping
    public ResponseEntity<Brand> create(@RequestBody BrandDTO brandDTO) {
        Brand brand = EntiryMapper.toBrand(brandDTO);
        brand = brandSevice.save(brand);
        return ResponseEntity.ok(brand);
    }

    @GetMapping("{id}")
    public ResponseEntity<Brand> getById(@PathVariable("id") int id) {

        return ResponseEntity.ok(brandSevice.getId(id));

    }

    @PutMapping("{id}")
    public ResponseEntity<Brand> update(@PathVariable("id") int id, @RequestBody BrandDTO brandDTO) {
        return ResponseEntity.ok(brandSevice.update(id, brandDTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Brand> deleteById(@PathVariable("id") int id) {
        brandSevice.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getBrand() {
        List<Brand> brands = brandSevice.getBrand();
        List<BrandDTO> collect = brands.stream()
                .map(b -> EntiryMapper.toBrandDTO(b))
               // .toList();
              .collect(Collectors.toList());
        return ResponseEntity.ok(collect);

    }

}
