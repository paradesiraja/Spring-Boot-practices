package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Employee;

public interface IRepository extends JpaRepository<Employee,Integer> {

	
}
