package com.bobo.pawConnect.service; // package declaration


import com.bobo.pawConnect.model.Users;

import java.util.List;

public interface UserService {
    Users saveUser(Users user);
    List<Users> getAllUsers();
    Users getUserById(Long id);
    void deleteUser(Long id);
}



