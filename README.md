# code-test

## Description

This API use Database H2 and for the persistence is JPA for tables and querys. 
	
	Header request{
      String Accept,
      String Accept-Language,
      String Content-Type,
      String x-ibm-client-id,
      String Authorization,
      String x-santander-global-id}
      
1. Get all customers
2. Get one specific customer

### Versioning

0.0.1

#### Last modification date:
15/09/2019 by Deployment RAFAEL


### To Do


### Endpoints
> /customers GET

### Request data

URL : 
localhost:2210/customers

> Test data : 
> **Header OK:** {

	Accept:"application/json"
	Accept-Language:"es"
	Content-Type:"application/json"
	x-ibm-client-id:"785"
	Authorization:"autorization"
	x-santander-global-id:"897"
	
}

> **Request OK: ** {
    "customersData": [
        {
            "customerId": 1,
            "originChannel": "BANCA SERFIN",
            "fullName": "ACEVES GONZALEZ ADOLFO",
            "condition": "CLIENTE",
            "segment": "PREMIER",
            "address": "LOMA BONITA 1839",
            "customerCategory": "FISICA"
        },
        {
            "customerId": 2,
            "originChannel": "BANCA SERFIN",
            "fullName": "ACEVES GONZALEZ ADOLFO 2",
            "condition": "CLIENTE 2",
            "segment": "PREMIER 2",
            "address": "LOMA BONITA 1839",
            "customerCategory": "FISICA"
        },
        {
            "customerId": 3,
            "originChannel": "BANCA SERFIN",
            "fullName": "ACEVES GONZALEZ ADOLFO 3",
            "condition": "CLIENTE 3",
            "segment": "PREMIER 3",
            "address": "LOMA BONITA 1839",
            "customerCategory": "FISICA"
        }
    ]
}


URL : 
localhost:2210/customers/2

> Test data : 
> **Header OK:** {

	Accept:"application/json"
	Accept-Language:"es"
	Content-Type:"application/json"
	x-ibm-client-id:"785"
	Authorization:"autorization"
	x-santander-global-id:"897"
	
}

> **Request OK: ** {
    "customersData": [
        {
            "customerId": 2,
            "originChannel": "BANCA SERFIN",
            "fullName": "ACEVES GONZALEZ ADOLFO 2",
            "condition": "CLIENTE 2",
            "segment": "PREMIER 2",
            "address": "LOMA BONITA 1839",
            "customerCategory": "FISICA"
        }
    ]
}

## Built With
* Maven
* Spring
* SpringBoot


### Prerequisites
You need to have installed:
		
 - Java 1.8  		
 - Maven 		
 - Eclipse IDE or  Spring Tool Suite(STS)

## Deployment

	mvn spring boot:run
	
Or from Spring Tool Suite(STS) IDE right click on the project -> Run As -> Spring Boot App


