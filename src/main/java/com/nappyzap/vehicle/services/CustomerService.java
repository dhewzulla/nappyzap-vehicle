package com.nappyzap.vehicle.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nappyzap.vehicle.model.Customer;
import com.nappyzap.vehicle.repositories.CustomerRepository;



@RestController
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	
	@RequestMapping("/customers")
    public List<Customer> greeting(@RequestParam(value="name", required=false) String name) {
		Iterable<Customer> customerIterables=customerRepository.findAll();
		return  toList(customerIterables);
    }
	
	public List<Customer>  toList(Iterable<Customer> cusomerIterator){
		List<Customer> list = new ArrayList<Customer>();
	    if(cusomerIterator != null) {
	      for(Customer e: cusomerIterator) {
	        list.add(e);
	      }
	    }
	    return list;
	}
}
