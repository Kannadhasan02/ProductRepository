package com.myapp.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.myapp.product.entity.ProductEntity;
import com.myapp.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRep;
	
	public String postList(List<ProductEntity> pe){
		 proRep.saveAll(pe);
		 return "Successfully saved";
	}
	public ProductEntity getProDetail( int n) {
		return proRep.findById(n).get();
}
	public List<ProductEntity> getAllProducts() {
		return proRep.findAll();
	}


}
