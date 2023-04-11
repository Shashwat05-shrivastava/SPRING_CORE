package org.virtusa2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="Employee")
	public Employee employee() {
		Employee e=new Employee();
		e.seteNo(1);
		e.seteName("shashwat");
		e.setAddress("hyderabad");
		return e;
	}
}
