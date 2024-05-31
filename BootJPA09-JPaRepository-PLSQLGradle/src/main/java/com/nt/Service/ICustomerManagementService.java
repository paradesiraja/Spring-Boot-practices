package com.nt.Service;

import java.util.List;

import com.nt.entity.Customer;

public interface ICustomerManagementService {

	public List<Customer> showCustomerByBillamtRange(double start,double end);
}
