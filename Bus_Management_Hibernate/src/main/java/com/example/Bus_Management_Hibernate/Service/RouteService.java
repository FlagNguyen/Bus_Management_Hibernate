package com.example.Bus_Management_Hibernate.Service;

import com.example.Bus_Management_Hibernate.DAO.Entity.ROUTE;
import com.example.Bus_Management_Hibernate.DAO.Repository.RouteRepository;
import com.example.Bus_Management_Hibernate.Util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;

    DataUtil dataUtil = new DataUtil();

    public List<ROUTE> getAll() {
        return routeRepository.findAll();
    }

    public ROUTE addRoute(ROUTE route){
        route.setRoute_ID(100 + routeRepository.findAll().size() + 1);
        return routeRepository.save(route);
    }

    public boolean searchID(int routeID){
        return routeRepository.existsById(routeID);
    }

}
