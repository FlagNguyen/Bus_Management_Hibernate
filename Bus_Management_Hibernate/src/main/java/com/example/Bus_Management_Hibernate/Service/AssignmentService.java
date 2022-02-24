package com.example.Bus_Management_Hibernate.Service;

import com.example.Bus_Management_Hibernate.DAO.Entity.ASSIGNMENT;
import com.example.Bus_Management_Hibernate.DAO.Repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    DriverService driverService ;
    RouteService routeService;

    public List<ASSIGNMENT> getAll(){
        return assignmentRepository.findAll();
    }

    public ASSIGNMENT addAssignment(ASSIGNMENT assignment){
        if(!driverService.searchID(assignment.getDriver_id())){
            return null;
        }
        if(!routeService.searchID(assignment.getRoute_id())){
            return null;
        }
        return assignmentRepository.save(assignment);
    }
}
