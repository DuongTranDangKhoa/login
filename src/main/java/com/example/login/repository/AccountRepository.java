package com.example.login.repository;

import DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<User, String> {
    public User findByUsernameAndPassword(String username, String password);

}
