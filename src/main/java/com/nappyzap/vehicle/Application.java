package com.nappyzap.vehicle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nappyzap.vehicle.model.Customer;
import com.nappyzap.vehicle.model.Vehicle;
import com.nappyzap.vehicle.repositories.CustomerRepository;
import com.nappyzap.vehicle.repositories.VehicleRepository;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository, VehicleRepository vehicleRepository) {
		return (args) -> {
			// save a couple of customers
			customerRepository.save(new Customer("Dilshat", "Hewzulla"));
			customerRepository.save(new Customer("Aaron", "Birt"));
			customerRepository.save(new Customer("Nic", "Hamilton"));
			customerRepository.save(new Customer("Bill", "Gate"));
			customerRepository.save(new Customer("Steve", "Jobs"));
			
			
			vehicleRepository.save(new Vehicle("87L34343", new Timestamp(new Date(2016,2,3).getTime()), new Timestamp(new Date(2016,2,10).getTime())));
			vehicleRepository.save(new Vehicle("354287683", new Timestamp(new Date(2016,3,3).getTime()), new Timestamp(new Date(2016,3,10).getTime())));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : customerRepository.findAll()) {
				log.info(customer.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Customer customer = customerRepository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
            log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (Customer bauer : customerRepository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
            log.info("");
		};
	}

}
