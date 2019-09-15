package com.code.test.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.code.test.model.repository.EntityTableRepository;
import com.code.test.model.repository.UserEntityTable;
import com.code.test.model.response.CustomerDetail;
import com.code.test.model.response.CustomersData;
import com.code.test.service.CustomersService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	private EntityTableRepository entityRepository;

	@Value("${customers.data1}")
	private String customer1;

	@Value("${customers.data2}")
	private String customer2;

	@Value("${customers.data3}")
	private String customer3;

	@Override
	public CustomersData getCustomers() {
		CustomersData alResponse = new CustomersData();
		try {
			// Insert Data Example
			entityRepository.save(convertPojo(customer1));
			entityRepository.save(convertPojo(customer2));
			entityRepository.save(convertPojo(customer3));

			// Get all Customers
			List<CustomerDetail> customersData = new ArrayList<CustomerDetail>();
			for (UserEntityTable entity : entityRepository.findAll()) {
				customersData.add(convertEntityToPojo(entity));
			}

			alResponse.setCustomersData(customersData);
		} catch (IOException e) {
			System.out.println("error " + e.getMessage());
		}

		return alResponse;
	}

	private CustomerDetail convertEntityToPojo(UserEntityTable entity) {
		CustomerDetail customerDetail = new CustomerDetail();

		customerDetail.setAddress(entity.getAddress());
		customerDetail.setCondition(entity.getCondition());
		customerDetail.setCustomerCategory(entity.getCustomerCategory());
		customerDetail.setCustomerId(entity.getCustomerId());
		customerDetail.setFullName(entity.getFullName());
		customerDetail.setOriginChannel(entity.getOriginChannel());
		customerDetail.setSegment(entity.getSegment());

		return customerDetail;
	}

	private UserEntityTable convertPojo(String value) throws JsonParseException, JsonMappingException, IOException {
		CustomerDetail data1 = new ObjectMapper().readValue(value, CustomerDetail.class);

		UserEntityTable entity = new UserEntityTable();

		entity.setOriginChannel(data1.getOriginChannel());
		entity.setFullName(data1.getFullName());
		entity.setCondition(data1.getCondition());
		entity.setSegment(data1.getSegment());
		entity.setAddress(data1.getAddress());
		entity.setCustomerCategory(data1.getCustomerCategory());

		return entity;
	}

	@Override
	public CustomersData getOneCustomer(Long customerId) {

		List<CustomerDetail> customersData = new ArrayList<CustomerDetail>();

		Optional<UserEntityTable> response = entityRepository.findById(customerId);

		if (response.isPresent()) {
			customersData.add(convertEntityToPojo(response.get()));
		}
		CustomersData alResponse = new CustomersData();

		alResponse.setCustomersData(customersData);

		return alResponse;
	}

}
