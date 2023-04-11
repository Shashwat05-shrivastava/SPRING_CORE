package BeanAnnotation;

public class Student {
	private String sName;
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sName, Course course) {
		super();
		this.sName = sName;
		this.course = course;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void printDetails() {
		System.out.println("Student name is:  " + this.sName);
		System.out.println("Course Details are: " + course.getcId() + " " + course.getcName());
		}
}
