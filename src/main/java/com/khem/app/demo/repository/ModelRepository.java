package com.khem.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khem.app.demo.model.Model;

public interface ModelRepository extends JpaRepository<Model,Integer>{
    
}
