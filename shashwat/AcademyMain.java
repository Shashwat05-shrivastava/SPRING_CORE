package org.virtusa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AcademyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=  new ClassPathXmlApplicationContext("Academy.xml");
		Academy a=context.getBean("Academy",Academy.class);
		System.out.println(a.getaNo()+"\t"+a.getaName()+"\t");
		List<Courses> course=a.getCourse();
		course.forEach(courses-> System.out.println(courses.getcName()));
		
	}

}
