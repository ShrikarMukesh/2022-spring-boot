package com.productservice.controllers;

import com.productservice.exception.InvalidCouponException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.productservice.dto.Coupon;
import com.productservice.model.Product;
import com.productservice.repos.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	@Autowired
	private ProductRepo repo;

	@Autowired
	private RestTemplate restTemplate;

	@Value("${couponService.url}")
	private String couponServiceURL;

	@PostMapping(value = "/products")
	public Product create(@RequestBody Product product) {
		Coupon coupon = restTemplate.getForObject(getCouponServiceURL() + product.getCouponCode(), Coupon.class);
		if(coupon != null){
			product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		}else{
			throw new InvalidCouponException();
		}
		return repo.save(product);
	}

	public String getCouponServiceURL() {
		return couponServiceURL;
	}

	public void setCouponServiceURL(String couponServiceURL) {
		this.couponServiceURL = couponServiceURL;
	}

}
