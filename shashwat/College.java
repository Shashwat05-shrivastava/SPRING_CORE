package org.virtusa;

import java.util.List;

public class College {
	private int cId;
	private String cName;
	private List<String> courses;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int cId, String cName, List<String> courses) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.courses = courses;
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
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
}
