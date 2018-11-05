package com.vishnu.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vishnu.demo.domain.Customer;
import com.vishnu.demo.repository.CustomerRepo;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	private CustomerRepo repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		repository.save(new Customer("1","Allen","Delhi"));
		
		repository.save(new Customer("2","Solly","Mumbai"));
		
		repository.save(new Customer("3","RamRaj","Hyderabad"));
		
	}

}
