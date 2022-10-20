package com.khem.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khem.app.demo.model.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
	
}
