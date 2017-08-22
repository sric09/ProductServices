package com.sridhar.product.dao;

import com.sridhar.product.Product;

public interface ProductDAO {

	void create(Product p);

	Product read(int id);

	void update(Product p);

	void delete(int id);

}
