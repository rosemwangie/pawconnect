package com.bobo.pawConnect.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Users {

    @Id
    private Long id;
    private String username;
    private Long password;
    private Long  email;


    public void setId(java.lang.Long id) {
        this.id = id;
    }
    public java.lang.Long getId() {
        return id;
    }
}
