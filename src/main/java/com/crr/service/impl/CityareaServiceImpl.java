package com.crr.service.impl;

import com.crr.Repository.CityareaRepository;
import com.crr.domain.Branches;
import com.crr.domain.Cityarea;
import com.crr.service.CityareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityareaServiceImpl implements CityareaService {
    @Autowired
    private CityareaRepository cityareaRepository;
    @Override
    public List<Cityarea> getAllBranches() {
        return cityareaRepository.findAll();
    }
}
