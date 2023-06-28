package com.sharifa.Hardware.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Date date;
    public int saleQuantity;
    public int saleDiscount;
    public String paystatus;
    @ManyToOne
    @JoinColumn(name="custID")
    private customer customer;
   
    // @ManyToOne
    // @JoinColumn(name = "prodID")
    // private product product;





}
