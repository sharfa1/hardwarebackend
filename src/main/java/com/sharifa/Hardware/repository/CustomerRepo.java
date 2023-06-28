package com.sharifa.Hardware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharifa.Hardware.model.customer;

@Repository
public interface CustomerRepo extends JpaRepository<customer,Integer>{
    
}
