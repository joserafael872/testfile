package com.code.test.service;

import com.code.test.model.response.CustomersData;

public interface CustomersService {

	CustomersData getCustomers();
	
	CustomersData getOneCustomer(Long customerId);
}
