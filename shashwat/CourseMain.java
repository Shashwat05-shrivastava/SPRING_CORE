package org.virtusa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("course.xml");
		College c=context.getBean("College",College.class);
		System.out.println(c.getcId()+"\t"+c.getcName());
		List<String> courses=c.getCourses();
		courses.forEach(System.out::println);
	}

}
