package com.example.suduko.services;

import com.example.suduko.dao.UserRepository;
import com.example.suduko.entity.User;
import com.example.suduko.entity.dto.request.UserRequestDto;
import com.example.suduko.entity.dto.response.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository data;


    public UserResponseDto getUserById(int id) throws Exception {
       User u =  data.findById(id).orElseThrow(() -> new Exception("user not found"));
       return UserResponseDto.of(u);
    }

    public User saveUser (UserRequestDto u) {
        User uu = UserRequestDto.of(u);
        User user = data.save(uu);
        return user;
    }
}
