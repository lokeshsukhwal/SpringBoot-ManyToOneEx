package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
