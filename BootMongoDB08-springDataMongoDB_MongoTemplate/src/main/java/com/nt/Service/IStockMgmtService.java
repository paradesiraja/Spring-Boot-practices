package com.nt.Service;

import java.util.List;

import com.nt.Document.StockDetails;

public interface IStockMgmtService {

	public String registerStcakDetails(StockDetails details);
	public String registerAllStcakDetails(List<StockDetails> list);
	public List<StockDetails> fetchstackDetailsByPriceRange(double start,double end);
	public String fetchAndUpdateStockDetailsById(int stockId,double newPrice,String exchangeName);
	public String fetchAndUpdateStockDetailsByPriceRange(double start,double end,String exchangeName);
}
