# Microservice with Spring boot and Docker

One Paragraph of project description goes here

## Prerequisites

you should install Java >=8 and Docker


### Installing

git clone https://github.com/joserafael872/testfile.git

mvnw clean package

docker build -t code-test-gft .

docker run -d -p 8080:8080 code-test-gft


#### Description

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

#### Versioning

0.0.1

#### Last modification date:
15/09/2019 by Deployment RAFAEL


### To Do


### Endpoints
> /customers GET

### Request data

URL : 
localhost:8080/customers

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
localhost:8080/customers/2

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

