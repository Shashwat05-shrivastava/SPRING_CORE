package first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		/************ 1)First Method using ApplicationContext**********************/ 
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("first.xml");
		//Test test=(Test)context.getBean("t");
		
		/************ 2)Second method using BeanFactory (This one is deprecated)*******/
		
		Resource r=new ClassPathResource("first.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Test test=(Test)factory.getBean("t");
		
		test.hello();
		
	}

}
