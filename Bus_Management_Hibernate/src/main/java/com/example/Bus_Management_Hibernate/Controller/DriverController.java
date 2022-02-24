package com.example.Bus_Management_Hibernate.Controller;

import com.example.Bus_Management_Hibernate.DAO.Entity.DRIVERS;
import com.example.Bus_Management_Hibernate.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Drivers")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping
    public List<DRIVERS> getAll(){
        return driverService.getAll();
    }

    @PostMapping
    public DRIVERS addDriver(@RequestBody DRIVERS drivers){
        return driverService.addDriver(drivers);
    }
}
