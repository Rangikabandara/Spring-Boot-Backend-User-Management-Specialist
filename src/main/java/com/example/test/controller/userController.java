package com.example.test.controller;

import com.example.test.dto.UserDTO;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "api/v1/User")
@RestController
@CrossOrigin

public class userController {
    @GetMapping("/getUsers")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();
    }
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/userUpdate")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.userUpdate(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userService.userDelete(userDTO);
    }


}