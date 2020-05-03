package com.how2java.action;

import com.how2java.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class ProductAction {
	private Product product;

	public String show() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();

		System.out.println("request:\t" + request);
		System.out.println("response:\t" + response);

		product = new Product();
		product.setName("iphone8");
		product.setAge(9);
		return "show";
	}

	public String add(){
		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName()+":put the value into actionContext map");
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