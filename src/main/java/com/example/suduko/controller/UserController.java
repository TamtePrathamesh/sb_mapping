package com.example.suduko.controller;
import com.example.suduko.entity.User;
import com.example.suduko.entity.dto.request.UserRequestDto;
import com.example.suduko.entity.dto.response.UserResponseDto;
import com.example.suduko.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/byId/{id}")
    public UserResponseDto getUserById(@PathVariable int id) throws Exception {
        return service.getUserById(id);
    }

    @PostMapping("/saveUser")
    public UserResponseDto saveUser(@RequestBody UserRequestDto u) {
        User user = service.saveUser(u);
        return UserResponseDto.of(user);
    }
}
