package org.virtusa2;

public class Employee {
	private int eNo;
	private String eName;
	private String Address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eNo, String eName, String address) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		Address = address;
	}
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
