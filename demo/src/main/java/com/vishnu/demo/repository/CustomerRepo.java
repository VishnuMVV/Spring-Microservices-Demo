package com.vishnu.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishnu.demo.domain.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String>{

}
