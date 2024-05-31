package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustRepository;
@Service("service")
public class CustomerMnmtService implements ICustomerService{
	@Autowired
	private ICustRepository custRepo;

	@Override
	public String deleteCustomerByIdInBatch(List<Integer> ids) {
		
		//load the entities
		List<Customer> list=custRepo.findAllById(ids);
		//delete the entities
		custRepo.deleteAllByIdInBatch(ids);
		return list.size()+"records are deleted";
	}

	@Override
	public Customer getCustomerById(int id) {
		//Customer customer=custRepo.getById(id);
		//Customer customer=custRepo.getOne(id);
		Customer customer=custRepo.getReferenceById(id);
		return customer;
	}

	@Override
	public List<Customer> showsCustomerExampleByID(Customer exCustomer, boolean ascOrder, String... properties) {
		
		//prepare sort obj
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,properties);
		//prepare Example obj
		Example example=Example.of(exCustomer);
		
		//use the repo
	List<Customer> list=	custRepo.findAll(example,sort);
		
		return list;
	}

	@Override
	public String groupCustomerRegistration(List<Customer> list) {
		custRepo.saveAllAndFlush(list);
		
		return list.size()+"No.of records are saved";
	}

}
