package com.nappyzap.vehicle.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nappyzap.vehicle.model.Customer;
import com.nappyzap.vehicle.model.Vehicle;
import com.nappyzap.vehicle.repositories.CustomerRepository;
import com.nappyzap.vehicle.repositories.VehicleRepository;

@RestController
public class VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;
	
	@RequestMapping("/vehicles")
    public List<Vehicle> greeting(@RequestParam(value="plate", required=false) String plate) {
		Iterable<Vehicle> customerIterables=vehicleRepository.findAll();
		return  toList(customerIterables);
    }
	
	public List<Vehicle>  toList(Iterable<Vehicle> cusomerIterator){
		List<Vehicle> list = new ArrayList<Vehicle>();
	    if(cusomerIterator != null) {
	      for(Vehicle e: cusomerIterator) {
	        list.add(e);
	      }
	    }
	    return list;
	}
	
}
