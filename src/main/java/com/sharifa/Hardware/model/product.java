package com.sharifa.Hardware.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class product {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int prodID;
    public String prodNme;
    public int prodQuantity;
    public int prodUnitprice;
    public int getProdID() {
        return prodID;
    }
    public void setProdID(int prodID) {
        this.prodID = prodID;
    }
    public String getProdNme() {
        return prodNme;
    }
    public void setProdNme(String prodNme) {
        this.prodNme = prodNme;
    }
    public int getProdQuantity() {
        return prodQuantity;
    }
    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }
    public int getProdUnitprice() {
        return prodUnitprice;
    }
    public void setProdUnitprice(int prodUnitprice) {
        this.prodUnitprice = prodUnitprice;
    }

    
}
