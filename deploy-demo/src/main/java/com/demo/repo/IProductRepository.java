package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{

}
