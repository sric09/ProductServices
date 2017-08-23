package com.sridhar.product.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sridhar.product.Product;

public class ProductDAOImplTest {

	@Test
	public void test() {
		ProductDAO prodDAO=new ProductDAOImpl();
		Product prod=new Product(1, "Iphone 6",45000);
		
		prodDAO.create(prod);
		Product read = prodDAO.read(1);
		assertNotNull(read);
	}

}
