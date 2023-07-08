package com.myapp.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.myapp.product.dao.ProductDao;
import com.myapp.product.entity.ProductEntity;

@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	
	public String postList(List<ProductEntity> pe){
		return proDao.postList(pe);
	}
	public ProductEntity getProDetail( int n) {
		return proDao.getProDetail(n);
}
	public List<ProductEntity> getAllProducts() {
		return proDao.getAllProducts();
	}

}
