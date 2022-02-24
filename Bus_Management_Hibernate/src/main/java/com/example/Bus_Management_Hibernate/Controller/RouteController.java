package com.example.Bus_Management_Hibernate.Controller;

import com.example.Bus_Management_Hibernate.DAO.Entity.ROUTE;
import com.example.Bus_Management_Hibernate.Service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<ROUTE> getAll(){
        return routeService.getAll();
    }

    @PostMapping
    public ROUTE addRoute(@RequestBody ROUTE routes){
        return routeService.addRoute(routes);
    }
}
