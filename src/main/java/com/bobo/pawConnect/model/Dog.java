package com.bobo.pawConnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dog {

    @Id
    private Long id;
    private String name;
    private String breed;
    private int age;
    private Long userId; //Foreign key to user
}
