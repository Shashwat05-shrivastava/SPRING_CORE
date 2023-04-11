package org.virtusa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.virtusa.controller.SampleController;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		SampleController controller=context.getBean("sampleController",SampleController.class);
		controller.controller();
	}

}