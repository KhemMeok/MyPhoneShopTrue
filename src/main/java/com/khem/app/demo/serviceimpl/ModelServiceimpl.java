package com.khem.app.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.khem.app.demo.model.Model;
import com.khem.app.demo.repository.ModelRepository;
import com.khem.app.demo.service.ModelService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ModelServiceimpl implements ModelService {

    private final ModelRepository modelRepository;

    @Override
    public Model save(Model entity) {

        return modelRepository.save(entity);
    }

}
