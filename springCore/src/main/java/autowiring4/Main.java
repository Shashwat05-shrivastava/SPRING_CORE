package autowiring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student=(Student)context.getBean("getStudent");
		student.print();
	}

}
