package com.nt.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepo;

@Service("custService")
public class CustomerMgmtImpl implements ICustomerService {
	
	@Autowired
	private ICustomerRepo CustomerRepo;

	@Override
	public String GroupOfregisterCustomers(Iterable<Customer> customers) {
		if(customers!=null) {
			Iterable<Customer> savedOrdered=CustomerRepo.saveAll(customers);
			int size=((Collection)savedOrdered).size();
			List<Integer> ids=new ArrayList();
			savedOrdered.forEach(c->{
				ids.add(c.getCno());
			});
			return size+"no.of customers are saved with id values :"+ids.toString();
		}
		
		else {
			throw new  IllegalArgumentException("invalid customer info");
		}
		
	}

	

	
	/*
	 * @Override public String GroupOfregisterCustomers(Iterable<Customer>
	 * customers) { Iterable<Customer> orderedList=CustomerRepo.saveAll(customers);
	 * int size=((Collection)orderedList).size(); List<Customer>
	 * ids=(List<Customer>)
	 * ((Collection)orderedList).stream().map(c->((Customer)c).getCno()).collect(
	 * Collectors.toList()); return size
	 * +"no.of customers are saved with id values ::"+ids.toString(); }
	 */

	@Override
	public Optional<Customer> getCustomerById(Integer id) {
		
		if(id>0)
			return Optional.of(new Customer());
		else
		return Optional.empty();
	}




	@Override
	public String updateCustomerBillAmountById(Integer Id, Float Discount) {
		Optional<Customer> opt=CustomerRepo.findById(Id);
		if(opt.isPresent()) {
			Customer customer=opt.get();
			Float Discount1=customer.getBillAmt()*(Discount/100.0f);
		customer.setBillAmt(customer.getBillAmt()-Discount1);
		CustomerRepo.save(customer);
			return Id+"is updated with "+customer.getBillAmt();
		
		}
		return Id+"record not found";
	}




	@Override
	public String updateCustomerNewNameById(Integer Id, String Cname) {
	
		Optional<Customer> opt=CustomerRepo.findById(Id);
		if(opt.isPresent()) {
			Customer customer=opt.get();
			customer.setCName(Cname);
			CustomerRepo.save(customer);
			
			return Id+"updated with"+customer.getCName();
		}
		return "customer not found";
	}
}
