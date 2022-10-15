package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
