package com.nt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	//@Query("FROM Customer WHERE billamt>=?1 AND billamt>=?2")
	
	//@Query("FROM com.nt.entity.Customer WHERE billamt>=?1 AND billamt>=?2")
//	@Query("FROM com.nt.entity.Customer WHERE billamt>=:start AND billamt>=:end")
//	
//	public List<Customer> showsCustomerBillamtRange(double start ,double end);
	
	//Bulk operations
	@Query("FROM Customer WHERE caddrs IN(:addrs1,:addrs2) ORDER BY caddrs")
	public List<Customer> searchCustomerByCaddrs(String addrs1,String addrs2);
	
	//select projection query with specific multiple col values
	@Query("SELECT cno,cname,caddrs FROM Customer WHERE billamt BETWEEN :start AND :end")
	public List<Object[]> searchCustomerDataByBillamtRange(double start,double end);
	
	//select projection query with specific multiple col values
	@Query("SELECT cname FROM Customer WHERE billamt BETWEEN :start AND :end")
	public List<String> searchCustomerDataByBillamt(double start,double end);
	

	
	//Aggregate operations
	@Query("SELECT COUNT(DISTINCT cname)FROM Customer")
	public int fetchCustomerNamesCount();
	
	@Query("SELECT COUNT(*),MAX(billamt),MIN(billamt),AVG(billamt),SUM(billamt) FROM Customer")
	public Object fetchAgrregateData();
	
	
	//Non-select Query
	@Query("UPDATE Customer SET billamt=billamt+(billamt* :percentage/100.0) WHERE caddrs IN(:addrs1,:addrs2)")
	@Modifying
	@Transactional
	public int HikeCustomerBillamtByAddrs(double percentage,String addrs1,String addrs2);
	
	@Query("DELETE FROM Customer WHERE billamt>=:start AND billamt<=:end")
	@Modifying
	@Transactional
	public int removecustomerByBillamtRange(double start,double end);
}
