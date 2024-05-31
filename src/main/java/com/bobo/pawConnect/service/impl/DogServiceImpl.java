package com.bobo.pawConnect.service.impl;

import com.bobo.pawConnect.model.Dog;
import com.bobo.pawConnect.repository.DogRepository;
import com.bobo.pawConnect.service.DogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    private final DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    @Override
    public Dog getDogById(Long id) {
        return dogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDog(Long id) {
        dogRepository.deleteById(id);
    }
}
