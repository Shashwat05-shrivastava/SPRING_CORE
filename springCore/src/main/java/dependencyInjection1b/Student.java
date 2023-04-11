package dependencyInjection1b;

public class Student {
	private String sName;
	private Courses courses;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public void printDetails() {
		System.out.println("Name is --->" + this.sName);
		System.out.println("Course Name is --->" + courses.getcName() + "Courses Id is ---> " + courses.getcId());
	}
	
}
