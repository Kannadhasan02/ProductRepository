package com.myapp.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {



}
