package com.sridhar.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.sridhar.product.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer, Product> prod=new HashMap<>();

	@Override
	public void create(Product p) {
		
		prod.put(p.getId(), p);

	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return prod.get(id);
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
