package com.bobo.pawConnect.repository;

import com.bobo.pawConnect.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DogRepository extends JpaRepository<Dog, Long> {

}
