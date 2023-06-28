package com.sharifa.Hardware.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int custID ;
    public String custFname;
    public String custLname;
    public String custAdress;
    public String custPhone;
    public int getCustID() {
        return custID;
    }
    public void setCustID(int custID) {
        this.custID = custID;
    }
    public String getCustFname() {
        return custFname;
    }
    public void setCustFname(String custFname) {
        this.custFname = custFname;
    }
    public String getCustLname() {
        return custLname;
    }
    public void setCustLname(String custLname) {
        this.custLname = custLname;
    }
    public String getCustAdress() {
        return custAdress;
    }
    public void setCustAdress(String custAdress) {
        this.custAdress = custAdress;
    }
    public String getCustPhone() {
        return custPhone;
    }
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
