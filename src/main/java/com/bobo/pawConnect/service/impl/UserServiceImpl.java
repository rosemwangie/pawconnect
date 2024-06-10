package com.bobo.pawConnect.service.impl;

import com.bobo.pawConnect.model.Users;
import com.bobo.pawConnect.repository.UserRepository;
import com.bobo.pawConnect.service.UserService;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users saveUser(Users user){
        return userRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id ){
        userRepository.deleteById(id);
    }
}
