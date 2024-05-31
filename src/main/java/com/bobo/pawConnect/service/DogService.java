package com.bobo.pawConnect.service;

import com.bobo.pawConnect.model.Dog;

import java.util.List;

public interface DogService {
    Dog saveDog(Dog user);
    //List<Dog> getAllDog();

    List<Dog> getAllDogs();

    Dog getDogById(Long id);
    void deleteDog(Long id);
}