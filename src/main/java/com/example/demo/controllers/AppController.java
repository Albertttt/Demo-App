package com.example.demo.controllers;

import com.example.demo.model.Auto;
import com.example.demo.model.People;
import com.example.demo.services.BuyAutoService;
import com.example.demo.services.GetAllService;
import com.example.demo.services.SearchService;
import com.example.demo.util.ToJson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class AppController {
    final BuyAutoService buyAutoService;
    final SearchService searchService;
    final GetAllService<Auto> getAllAutoService;
    final GetAllService<People> getAllPeopleService;

    @GetMapping("/buy")
    public ResponseEntity buy(@RequestParam String autoId, @RequestParam String peopleId) {
        ResponseEntity entity;
        entity = ResponseEntity.ok().body(buyAutoService.buyAuto(Long.valueOf(autoId), Long.valueOf(peopleId)));
        return entity;
    }

    @GetMapping
    public ResponseEntity search(@RequestParam String snippet) {
        ResponseEntity entity;
        entity = ResponseEntity.ok().body(searchService.search(snippet));
        return entity;
    }

    @GetMapping("/getAllCars")
    public ResponseEntity getAllCars() {
        ResponseEntity entity;
        List<Auto> autoList;
        autoList = getAllAutoService.getAll();
        ToJson toJson = new ToJson();
        entity = ResponseEntity.ok().body(toJson.autosToJson(autoList));
        return entity;
    }

    @GetMapping("/getAllPeople")
    public ResponseEntity getAllPeople() {
        ResponseEntity entity;
        List<People> peopleList;
        peopleList = getAllPeopleService.getAll();
        ToJson toJson = new ToJson();
        entity = ResponseEntity.ok().body(toJson.peoplesToJson(peopleList));
        return entity;
    }
}
