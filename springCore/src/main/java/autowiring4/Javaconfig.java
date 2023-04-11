package autowiring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {

	@Bean
	public Student getStudent() {
		Student st= new Student();
		return st;
	}
}
