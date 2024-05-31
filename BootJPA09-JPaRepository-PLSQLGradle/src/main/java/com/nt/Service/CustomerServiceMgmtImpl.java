package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.CustomerRepository;
import com.nt.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

/*CREATE OR REPLACE PROCEDURE P_GET_CUSTOMER_BY_BILL_RANGE 
(
  STARTBILLAMT IN FLOAT 
, ENDBILLAMT IN FLOAT 
, DETAILS OUT SYS_REFCURSOR 
) AS 
BEGIN
OPEN DETAILS FOR
SELECT
    * FROM jpa_customer_tab WHERE billamt>=STARTBILLAMT AND billamt<=ENDBILLAMT;
END P_GET_CUSTOMER_BY_BILL_RANGE*/

@Service("custService")
public class CustomerServiceMgmtImpl implements ICustomerManagementService{

	@Autowired
	private EntityManager manager;
	
	public List<Customer> showCustomerByBillamtRange(double start, double end) {
		//create storedorocedureQuery object pointing PL/SQL procedure
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_CUSTOMER_BY_BILL_RANGE",Customer.class);
		
		//register both IN and OUT params by specifying their mode
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		
		//set values to IN params
		query.setParameter(1, start);
		query.setParameter(2, end);
		
		//call PL/SQL procedure
		List<Customer> list=query.getResultList();
		return list;
	}

}
