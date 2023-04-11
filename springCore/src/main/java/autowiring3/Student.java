package autowiring3;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public void print() {
		System.out.println("Inside Student");
	}
}
