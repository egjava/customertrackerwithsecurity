package com.eliz.customertracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eliz.customertracker.entity.Customer;


public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomer(String theCustName);

}
