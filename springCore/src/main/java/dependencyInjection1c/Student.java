package dependencyInjection1c;

public class Student {
	private int sId;
	private String sName;
	private String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sId, String sName, String address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.address = address;
	}
	public void printDetails() {
		System.out.println("Student id: "+this.sId);
		System.out.println("Student Name: "+this.sName);
		System.out.println("Student Address: "+this.address);
	}
	
}
