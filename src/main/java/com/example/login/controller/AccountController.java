package com.example.login.controller;

import com.example.login.repository.AccountRepository;
import DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountRepository userService;
    @Autowired
    AccountRepository accountRepository;
    @GetMapping("/selectAccount")
    public User getUser(String username, String password){
        return accountRepository.findByUsernameAndPassword(username, password);
    }



}
