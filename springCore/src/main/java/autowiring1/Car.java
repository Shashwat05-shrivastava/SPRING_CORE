package autowiring1;

public class Car {
	private String carName;
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void getDetails() {
		System.out.println("Car name is: " + this.carName);
		System.out.println("Model Year is: " + engine.getModelYear());
	}
}
