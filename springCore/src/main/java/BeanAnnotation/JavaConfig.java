package BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Course getCourse() {
		Course course=new Course("B.Tech",101);
		return course;
	}
	
	@Bean
	public Student getStudent() {
		Student student=new Student("Shashwat",getCourse());
		return student;
	}
}
