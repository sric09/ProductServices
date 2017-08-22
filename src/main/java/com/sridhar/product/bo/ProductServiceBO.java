package com.sridhar.product.bo;

import com.sridhar.product.Product;

public interface ProductServiceBO {
	
	void createProduct(Product p);
	Product fetchProduct(int id);

}
