package com.example.Bus_Management_Hibernate.Controller;

import com.example.Bus_Management_Hibernate.DAO.Entity.ASSIGNMENT;
import com.example.Bus_Management_Hibernate.Service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Assignments")
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @GetMapping
    public List<ASSIGNMENT> getAll(){
        return assignmentService.getAll();
    }

    @PostMapping
    public ASSIGNMENT addAssignment(@RequestBody ASSIGNMENT assignment){
        return assignmentService.addAssignment(assignment);
    }
}
