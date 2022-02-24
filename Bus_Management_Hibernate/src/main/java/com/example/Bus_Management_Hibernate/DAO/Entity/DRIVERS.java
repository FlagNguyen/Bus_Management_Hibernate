package com.example.Bus_Management_Hibernate.DAO.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class DRIVERS {

    @Id
    @Column(name = "ID")
    private int driverID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "D_LEVEL")
    private String level;

    public DRIVERS() {
    }

    public int getDriverID() {
        return driverID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getLevel() {
        return level;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public DRIVERS(int driverID, String name, String address, String phone, String level) {
        this.driverID = driverID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.level = level;
    }
}
