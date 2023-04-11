package dependencyInjection1a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("collection.xml");
		Collection c= (Collection)context.getBean("collection");
		c.printNames();
		System.out.println("Fruits are: "  +c.getFruits());
		System.out.println("Veggies are: " + c.getVeggies());
		System.out.println("Country caps are: " + c.getCountryCap());
		c.print();
		
	}

}
