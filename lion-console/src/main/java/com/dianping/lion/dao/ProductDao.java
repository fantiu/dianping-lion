package com.dianping.lion.dao;

import java.util.List;

import com.dianping.lion.entity.Product;

public interface ProductDao {
	List<Product> findAll();
	
	Product findProductByID(int id);
	
	List<Product> findProductByTeamID(int teamId);
	
	int save(Product product);
	
	void update(Product product);
	
	void delete(int id);
}
