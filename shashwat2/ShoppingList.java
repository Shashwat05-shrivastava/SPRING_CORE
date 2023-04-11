package org.virtusa2;

import java.util.List;

public class ShoppingList {
	private List<Product> products;

	public ShoppingList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingList(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
