package com.example.demo.services.impl;

import com.example.demo.model.Auto;
import com.example.demo.repository.AutoRepository;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.services.GetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllCarsServiceImpl implements GetAllService<Auto> {

    final AutoRepository autoRepository;
    final PeopleRepository peopleRepository;

    @Override
    public List getAll() {
        List<Auto> autoList;
        autoList = autoRepository.findAll();
        return autoList;
    }
}
