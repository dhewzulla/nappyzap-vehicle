package com.nappyzap.vehicle.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.nappyzap.vehicle.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    List<Vehicle> findByPlateNumber(String plateNumber);
    
}
