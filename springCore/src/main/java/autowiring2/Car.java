package autowiring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String carName;
	
	
	@Autowired
	private Engine engine;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printDetails() {
		System.out.println("Car Name is: "+ this.carName);
		System.out.println("Model Year is: " + engine.getModelYear());
	}
}
