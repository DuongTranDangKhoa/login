package com.example.login.service;

import DTO.User;
import com.example.login.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accRepo;
    public void addNewAccount(User acc){
        accRepo.save(acc);
    }

}
