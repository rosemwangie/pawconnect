package com.bobo.pawConnect.repository;

import com.bobo.pawConnect.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Defines an interface named userRepository
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // JpaRepository provides methods methods like save, findById, findAll, deleteById
}
