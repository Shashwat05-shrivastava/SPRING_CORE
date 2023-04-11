package BeanAnnotation;

public class Course {
	private String cName;
	private int cId;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String cName, int cId) {
		super();
		this.cName = cName;
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
}
