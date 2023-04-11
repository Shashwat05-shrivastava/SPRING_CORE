package org.virtusa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext2.xml");
		Employee e=context.getBean("Employee",Employee.class);
		Address address=e.getAddress();
		System.out.println(e.geteNo()+"\t"+e.geteName());
		System.out.println(address.getdNo()+"\t"+address.getStreetName()+"\t"+address.getLocation());
	}

}
