package com.myapp.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.myapp.product.entity.ProductEntity;
import com.myapp.product.service.ProductService;

@RestController
public class Controller {
	@Autowired
	ProductService proSer;

	@PostMapping(value = "/postListProduct")
	public String postList(@RequestBody List<ProductEntity> pe) {
		return proSer.postList(pe);
	}
	@GetMapping(value = "/getid/{n}")
	public ProductEntity getProDetail(@PathVariable int n) {
		return proSer.getProDetail(n);
}
	@GetMapping(value = "/getlist")
	public List<ProductEntity> getAllProducts() {
		return proSer.getAllProducts();
	}
	
}
