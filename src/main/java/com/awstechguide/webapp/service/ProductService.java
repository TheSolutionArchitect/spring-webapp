package com.awstechguide.webapp.service;

import java.util.List;

import com.awstechguide.webapp.model.Products;

public interface ProductService {
	String SERVICE_NAME="products";
	List<Products> getProducts();
}
