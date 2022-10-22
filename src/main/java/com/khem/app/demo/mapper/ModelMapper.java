package com.khem.app.demo.mapper;

import org.mapstruct.Mapper;

import com.khem.app.demo.model.Model;

@Mapper
public interface ModelMapper {
    Model toModel(Model dto);
}
