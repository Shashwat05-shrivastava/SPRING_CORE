package dependencyInjection1a;
import java.util.*;

public class Collection {

	private String[] name;
	private List fruits;
	private Set veggies;
	private HashMap countryCap;
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getVeggies() {
		return veggies;
	}
	public void setVeggies(Set veggies) {
		this.veggies = veggies;
	}
	public HashMap getCountryCap() {
		return countryCap;
	}
	public void setCountryCap(HashMap countryCap) {
		this.countryCap = countryCap;
	}
	public void printNames() {
		for(String s:name) {
			System.out.println(s);
		}
	}
	public void print() {
		System.out.println("Inside collection");
	}
	
}
