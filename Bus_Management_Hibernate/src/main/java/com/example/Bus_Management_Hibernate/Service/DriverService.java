package com.example.Bus_Management_Hibernate.Service;

import com.example.Bus_Management_Hibernate.DAO.Entity.DRIVERS;
import com.example.Bus_Management_Hibernate.DAO.Repository.DriverRepository;
import com.example.Bus_Management_Hibernate.Util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
  @Autowired
    private DriverRepository driverRepository;

  DataUtil dataUtil = new DataUtil();

  public List<DRIVERS> getAll (){
      return driverRepository.findAll();
  }

  public DRIVERS addDriver(DRIVERS drivers){
      drivers.setDriverID(10000 + driverRepository.findAll().size() + 1);
      drivers.setName(dataUtil.standardlizeString(drivers.getName()));
      drivers.setAddress(dataUtil.standardlizeString(drivers.getAddress()));
      return driverRepository.save(drivers);
  }

  public boolean searchID(int driverID){
      return driverRepository.existsById(driverID);
  }
}
