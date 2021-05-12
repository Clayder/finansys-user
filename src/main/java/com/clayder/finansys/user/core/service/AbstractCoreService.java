package com.clayder.finansys.user.core.service;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class AbstractCoreService implements ICoreService{

    protected ModelMapper modelMapper;

    public AbstractCoreService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }
}
