package org.virtusa;

public class Courses {
	private int cId;
	private String cName;
	private int cPrice;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(int cId, String cName, int cPrice) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPrice = cPrice;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	
}
