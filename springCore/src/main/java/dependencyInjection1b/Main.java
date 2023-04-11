package dependencyInjection1b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("studentCourses.xml");
		Student s=(Student)context.getBean("student");
		s.printDetails();

	}

}
