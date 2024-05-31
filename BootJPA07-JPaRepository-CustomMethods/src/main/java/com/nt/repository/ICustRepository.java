package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;
import com.nt.view.IResultView;
import com.nt.view.IView;

public interface ICustRepository extends JpaRepository<Customer,Integer>{

	public List<Customer> getByCnameEquals(String name);
	public List<Customer> readByCnameIs(String name);
	public List<Customer> findByCname(String name);
	
	//multiple properties
	public Iterable<Customer> findByBillamtGreaterThanAndBillamtLessThan(Float startRang,Float endRange);
	//public Iterable<Customer> findByCAddrsInOrBillAmtBetween(List<String> addrs,double startRang,double endRange);
	
	//static scalar
	public List<IResultView> findByCaddrsIn(List<String> Caddrs);
	
	//Dynamic Scalar
	public <Customer extends IView> Iterable<Customer> findByBillamtBetween(double start,double end,Class<Customer>clazz);
}
