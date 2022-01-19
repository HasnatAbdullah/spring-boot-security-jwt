package com.example.demo.repository;

import com.example.demo.domain.appUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<appUser, Long> {
    appUser findByUsername(String username);
}
