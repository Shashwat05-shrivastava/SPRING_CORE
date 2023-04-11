package org.virtusa;

public class Address {
	private int dNo;
	private String streetName;
	private String Location;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int dNo, String streetName, String location) {
		super();
		this.dNo = dNo;
		this.streetName = streetName;
		Location = location;
	}
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
}
