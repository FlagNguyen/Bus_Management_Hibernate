package com.example.Bus_Management_Hibernate.DAO.Repository;

import com.example.Bus_Management_Hibernate.DAO.Entity.ROUTE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<ROUTE,Integer> {

}
