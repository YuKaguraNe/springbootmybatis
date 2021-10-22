package com.example.springboot.service;

import com.example.springboot.bean.Account;
import com.example.springboot.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;
    public List<Account> getAllAccounts(){
        return accountMapper.getAllAccounts();
    }
}


