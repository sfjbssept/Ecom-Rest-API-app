package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.Product;
import com.demo.repo.IProductRepository;

public class ProductServiceImpl implements IProductService{

	@Autowired
	IProductRepository productRepository;

	@Override
	public Integer addProduct(Product product) {
		Product addProduct = productRepository.save(product);
		return addProduct.getId();
	}
	
	
}
