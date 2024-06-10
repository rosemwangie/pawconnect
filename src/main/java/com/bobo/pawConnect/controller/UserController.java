package com.bobo.pawConnect.controller;

import com.bobo.pawConnect.model.Users;
import com.bobo.pawConnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    // Constructor Injection
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

   @PostMapping
    public Users createUser(@RequestBody Users user){
       return userService.saveUser(user);
   }

   @GetMapping
    public List<Users> getAllUsers() {
       return userService.getAllUsers();
   }

   @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id){
       return userService.getUserById(id);
   }

   @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
       userService.deleteUser(id);
   }

}
