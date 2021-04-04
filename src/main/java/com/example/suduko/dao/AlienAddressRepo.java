package com.example.suduko.dao;

import com.example.suduko.entity.AlienAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienAddressRepo extends JpaRepository<AlienAddress, Integer> {
}
