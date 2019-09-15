package com.code.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.test.model.response.CustomersData;
import com.code.test.service.CustomersService;

/**
 * CustomerController class to retrieve information.
 */

@CrossOrigin
@RestController
@RequestMapping
@Validated
public class CustomerController {

	@Autowired
	CustomersService customersService;

	@GetMapping("${controller.base-path.all}")
	public CustomersData getCustomers(@RequestHeader(value = "Accept", required = true) String accept,
			@RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
			@RequestHeader(value = "Content-Type", required = true) String contentType,
			@RequestHeader(value = "x-ibm-client-id", required = true) String ibmClientId,
			@RequestHeader(value = "Authorization", required = false) String authorization,
			@RequestHeader(value = "x-santander-global-id", required = false) String santanderGlobalId) {
		CustomersData response = new CustomersData();

		response = customersService.getCustomers();

		return response;

	}

	@GetMapping("${controller.base-path.one}")
	public CustomersData getOneCustomer(@PathVariable("customerId") Long customerId,
			@RequestHeader(value = "Accept", required = true) String accept,
			@RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
			@RequestHeader(value = "Content-Type", required = true) String contentType,
			@RequestHeader(value = "x-ibm-client-id", required = true) String ibmClientId,
			@RequestHeader(value = "Authorization", required = false) String authorization,
			@RequestHeader(value = "x-santander-global-id", required = false) String santanderGlobalId) {
		CustomersData response = new CustomersData();

		response = customersService.getOneCustomer(customerId);

		return response;

	}

}
