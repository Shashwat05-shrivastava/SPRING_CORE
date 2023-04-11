package dependencyInjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		Student s=(Student)context.getBean("student");
		System.out.println("Student id: "+ s.getsId() + "Student name: "+ s.getsName());

	}

}
