package com.example.demo.controller;

import com.example.demo.model.Doggy;
import com.example.demo.repository.DoggyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DoggyController {

    private final DoggyRepository doggyRepository;

    @GetMapping("/all")
    public List<Doggy> getAll() {
        return doggyRepository.findAll();
    }

    @PostMapping("/save")
    public String saveDoggy(@RequestBody Doggy doggy) {
        doggyRepository.save(doggy);
        return "Saved " + doggy.getName();
    }
}
