package com.bobo.pawConnect.controller;


import com.bobo.pawConnect.model.Dog;
import com.bobo.pawConnect.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/dogs")
public class DogController {

    public final DogService dogService;

    // Constructor Injection
    @Autowired
    public DogController(DogService dogService){
        this.dogService = dogService;
    }

    @PostMapping
    public Dog createDog(@RequestBody Dog dog){
        return dogService.saveDog(dog);
    }

    @GetMapping
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping("/{id}")
    public Dog getDogById(@PathVariable Long id){
        return dogService.getDogById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        dogService.deleteDog(id);
    }
}
