package com.example.demo.services.impl;

import com.example.demo.model.People;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.services.GetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllPeopleServiceImpl implements GetAllService<People> {
    final PeopleRepository peopleRepository;

    @Override
    public List<People> getAll() {
        return peopleRepository.findAll();
    }
}
