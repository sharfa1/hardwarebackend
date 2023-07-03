package com.sharifa.Hardware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharifa.Hardware.model.product;


@Repository
public interface ProductRepo extends JpaRepository <product,Integer> {
    
}
