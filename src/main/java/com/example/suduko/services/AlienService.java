package com.example.suduko.services;

import com.example.suduko.dao.AlienRepo;
import com.example.suduko.entity.Alien;
import com.example.suduko.entity.dto.request.AlienRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlienService {
    @Autowired
    AlienRepo ar;

    public Alien saveAlien(AlienRequestDto ard) {
        Alien aa = ar.save(AlienRequestDto.of(ard));
        return aa;
    }

    public Optional<Alien> getAlienById(int id) {
        Optional<Alien>  aa = Optional.ofNullable(ar.findById(id)).orElseGet(() -> Optional.empty());
        return aa;
    }

    public Optional<List<Alien>> getAllAliens() {
        Optional<List<Alien>> aliens = Optional.ofNullable(ar.findAll());
        return  aliens;
    }
}
