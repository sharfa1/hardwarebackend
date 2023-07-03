package com.sharifa.Hardware.controler;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharifa.Hardware.model.customer;
import com.sharifa.Hardware.model.product;
import com.sharifa.Hardware.repository.ProductRepo;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:3000")
public class productApi {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/List")
    public List<product> getproduct(){
        return productRepo.findAll();
    }
    @PostMapping(value = "/save")
    public product createProduct(@RequestBody product product){
    return productRepo.save(product);
    }
    @DeleteMapping(value = "/delete/{prodID}")
    public String deleteProduct(@PathVariable Integer prodID){
        product deleteProduct=productRepo.findById(prodID).get();
        productRepo.delete(deleteProduct);
        return"delete";
    }
    @GetMapping("/getbyId/{prodID}")
    public Optional<product> getproduct(@PathVariable Integer prodID){return productRepo.findById(prodID);}

}


 