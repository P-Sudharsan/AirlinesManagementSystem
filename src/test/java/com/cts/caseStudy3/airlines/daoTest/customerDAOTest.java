package com.cts.caseStudy3.airlines.daoTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.cts.caseStudy3.airlines.dao.CustomerDAO;
import com.cts.caseStudy3.airlines.dao.CustomerDAOImpl;
import com.cts.caseStudy3.airlines.model.Customer;

class customerDAOTest {
	
	

	@Test
	void test() {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer cus = customerDAO.getCustomer("Harish");
		assertNotNull(cus);
	}

}
