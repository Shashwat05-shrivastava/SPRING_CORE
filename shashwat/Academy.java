package org.virtusa;

import java.util.List;

public class Academy {
	private int aNo;
	private String aName;
	private List<Courses>course;
	public Academy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Academy(int aNo, String aName, List<Courses> course) {
		super();
		this.aNo = aNo;
		this.aName = aName;
		this.course = course;
	}
	public int getaNo() {
		return aNo;
	}
	public void setaNo(int aNo) {
		this.aNo = aNo;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public List<Courses> getCourse() {
		return course;
	}
	public void setCourse(List<Courses> course) {
		this.course = course;
	}
	
	
}
