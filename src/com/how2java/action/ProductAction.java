package com.how2java.action;

import com.how2java.bean.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductAction {
	private Product product;

	public String show() {
		product = new Product();
		product.setName("iphone7");
		product.setAge(7);
		return "show";
	}

	public String add(){
		System.out.println("product.name:"+product.getName());
		return "show";
	}

	public String showtime() {
		return "showtime";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}