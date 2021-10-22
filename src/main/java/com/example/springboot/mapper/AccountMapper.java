package com.example.springboot.mapper;

import com.example.springboot.bean.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    List<Account> getAllAccounts();

}

