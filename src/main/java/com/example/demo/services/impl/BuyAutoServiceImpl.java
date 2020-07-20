package com.example.demo.services.impl;

import com.example.demo.model.Auto;
import com.example.demo.model.People;
import com.example.demo.repository.AutoRepository;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.services.BuyAutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BuyAutoServiceImpl implements BuyAutoService {

    final PeopleRepository peopleRepository;
    final AutoRepository autoRepository;

    @Override
    public String buyAuto(Long autoId, Long peopleId) {
        Auto auto = new Auto();
        Optional<Auto> optionalAuto = autoRepository.findById(autoId);
        Optional<People> optionalPeople = peopleRepository.findById(peopleId);
        if (!optionalAuto.isPresent()) {
            return "auto not found";
        }
        if (!optionalPeople.isPresent()) {
            return "people not found";
        } else {
            auto = optionalAuto.get();
            auto.setOwner(peopleRepository.getOne(peopleId));
            autoRepository.save(auto);
            return "auto " + auto.getModel() + " owner " + auto.getOwner().getName();
        }
    }
}
