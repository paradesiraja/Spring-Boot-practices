package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nt.Document.StockDetails;

@Service("stockService")
public class StockmanagmentSerice implements IStockMgmtService {

	@Autowired
	private MongoTemplate template;
	@Override
	public String registerStcakDetails(StockDetails details) {
		int idVal=template.insert(details).getStockId();
		return "saved by stockDetails values"+idVal;
	}
	@Override
	public String registerAllStcakDetails(List<StockDetails> list) {
		int size=template.insertAll(list).size();
		return size + "no.of records are saved";
	}
	@Override
	public List<StockDetails> fetchstackDetailsByPriceRange(double start, double end) {
		
		Query query=new Query();
		query.addCriteria(Criteria.where("price").gte(start).lte(end));
		List<StockDetails> list=template.find(query,StockDetails.class);
		return list;
	}
	@Override
	public String fetchAndUpdateStockDetailsById(int stockId, double newPrice, String exchangeName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockId").is(stockId));
		Update update=new Update();
		update.set("exchangeName",exchangeName);
		update.set("price", newPrice);
		//call the method
		StockDetails details=template.findAndModify(query, update, StockDetails.class);
		
		
		return details==null?"stock class not found":"stock found and updated";
	}
	@Override
	public String fetchAndUpdateStockDetailsByPriceRange(double start, double end,String exchangeName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("price").gte(start).andOperator(Criteria.where("price").lte(end)));
		Update update=new Update();
		update.set("exchangeName",exchangeName);
		//call the method
		UpdateResult details=template.updateMulti(query, update, StockDetails.class);
		
		
		return details.getModifiedCount()+" No.of records are effected";
	}

	
}
