package org.virtusa2;

public class Product {
	private int pId;
	private String name;
	private String Decription;
	private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, String name, String decription, int price) {
		super();
		this.pId = pId;
		this.name = name;
		Decription = decription;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecription() {
		return Decription;
	}
	public void setDecription(String decription) {
		Decription = decription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
