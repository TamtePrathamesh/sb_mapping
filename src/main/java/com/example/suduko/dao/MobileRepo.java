package com.example.suduko.dao;

import com.example.suduko.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {
}
