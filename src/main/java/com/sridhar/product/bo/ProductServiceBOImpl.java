package com.sridhar.product.bo;

import com.sridhar.product.Product;
import com.sridhar.product.dao.ProductDAO;

public class ProductServiceBOImpl implements ProductServiceBO {

	private ProductDAO dao;
	
	@Override
	public void createProduct(Product p) {
		dao.create(p);

	}

	@Override
	public Product fetchProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	

}
