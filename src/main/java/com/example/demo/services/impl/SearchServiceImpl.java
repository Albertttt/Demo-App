package com.example.demo.services.impl;

import com.example.demo.model.People;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.services.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    final PeopleRepository repository;

    @Override
    public List<People> search(String snippet) {
        List<People> peopleList = new ArrayList<>();
        peopleList = repository.search(snippet);
        return peopleList;
    }
}
