package com.example.demo.services;

import com.example.demo.model.People;

import java.util.List;

public interface SearchService {
    List<People> search(String snippet);
}
