package com.khem.app.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khem.app.demo.dto.ModelDTO;
import com.khem.app.demo.model.Model;
import com.khem.app.demo.service.ModelService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/models")
@RequiredArgsConstructor
public class ModelController {

    private final ModelService modelService;

    public ResponseEntity<?> create(@RequestBody ModelDTO dto){

        Model model = new Model();
         
        modelService.save(null);
        return ResponseEntity.ok(dto);
    } 
    
}
