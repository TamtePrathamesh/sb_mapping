package com.example.suduko.controller;

import com.example.suduko.entity.dto.request.AlienRequestDto;
import com.example.suduko.entity.dto.response.AlienResponseDto;
import com.example.suduko.services.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alien")
public class AlienController {

    @Autowired
    AlienService as;

    @GetMapping("/byId/{id}")
    public Optional<AlienResponseDto> getAlienById(@PathVariable int id)  {
        return Optional.ofNullable(AlienResponseDto.of(as.getAlienById(id).get()));
    }

    @GetMapping("/allAliens")
    public List<AlienResponseDto> getAllAliens() {
        return as.getAllAliens().get().stream().map(item -> AlienResponseDto.of(item)).collect(Collectors.toList());
    }

    @PostMapping("/saveAlien")
    public AlienResponseDto saveAlien(@RequestBody AlienRequestDto aa) {
        return AlienResponseDto.of(as.saveAlien(aa));
    }
}
