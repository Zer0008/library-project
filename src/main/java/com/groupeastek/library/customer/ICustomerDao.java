package com.groupeastek.library.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer>{
	
	public List<Customer> findByLastName(String lastName);
	
	public List<Customer> findByFirstName(String firstName);
	
	public Customer findByEmail(String email);
	
	public List<Customer> findByJob(String job);
}
