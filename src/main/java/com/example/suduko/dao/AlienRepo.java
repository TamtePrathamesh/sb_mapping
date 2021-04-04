package com.example.suduko.dao;

import com.example.suduko.entity.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer> {
}
