package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
}
