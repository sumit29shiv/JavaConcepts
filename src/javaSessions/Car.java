package javaSessions;

public class Car {
	
	String name;
	String color;
	int price;
	String model;

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "Red";
		c1.price = 250000;
		c1.model = "Q3";
		
		System.out.println(c1.name);
	

	}

}
