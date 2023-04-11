
package org.virtusa2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShoppingConfig {
	@Bean
	public Product product1() {
		Product product = new Product();
		product.setpId(1);
		product.setName("Laptop");
		product.setDecription("asdashvfhjssagf");
		product.setPrice(400);
		return product;
	}
	@Bean
	public Product product2() {
		Product product = new Product();
		product.setpId(2);
		product.setName("System");
		product.setDecription("xyzdashvfhjssagf");
		product.setPrice(700);
		return product;
	}
	@Bean
	public ShoppingList shoppingList() {
		ShoppingList list=new ShoppingList();
		list.setProducts(products());
		return list;
	}
	private List<Product> products(){
		List<Product> products=new ArrayList<Product>();
		products.add(product1());
		products.add(product2());
		return products;
	}
}
