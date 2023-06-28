package com.sharifa.Hardware.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharifa.Hardware.model.customer;
import com.sharifa.Hardware.repository.CustomerRepo;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:3000")
public class customerApi {
    
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/List")
    public List<customer>getcustomer(){
        return customerRepo.findAll();
    }

    @PostMapping(value = "/save")
    public customer createCustomer(@RequestBody customer customer){
        return customerRepo.save(customer);
    }
    @PutMapping(value = "/update/{custID}")
    public String updatecustomer(@PathVariable Integer custID,@RequestBody customer customer){
        customer updatedCustomer=customerRepo.findById(custID).get();
        updatedCustomer.setCustFname(customer.getCustFname());
        updatedCustomer.setCustLname(customer.getCustLname());
        updatedCustomer.setCustAdress(customer.getCustAdress());
        updatedCustomer.setCustPhone(customer.getCustPhone());
            customerRepo.save(updatedCustomer);
            return"updated...";
   
    }
     @DeleteMapping(value = "/delete/{custID}")
    public String deletecustomer(@PathVariable Integer custID){
        customer deleteCustomer=customerRepo.findById(custID).get();
        customerRepo.delete(deleteCustomer);
        return"delete";


    }
    @GetMapping("/getbyId/{custID}")
    public Optional<customer> getcustomer(@PathVariable Integer custID){return customerRepo.findById(custID);}

}
