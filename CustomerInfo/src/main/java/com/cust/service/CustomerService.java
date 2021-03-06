package com.cust.service;

import java.util.List;

import com.cust.exception.ResourceNotFoundException;
import com.cust.model.Customer;


public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId) throws ResourceNotFoundException;

	public void deleteCustomer(int theId) throws ResourceNotFoundException;
	
}
