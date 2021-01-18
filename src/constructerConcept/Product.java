package constructerConcept;

import java.util.ArrayList;

public class Product {

	String name;
	double price;
	String color;
	ArrayList<String> sellerName;
	
	public Product() {
	System.out.println("Default Constructor with no params");	
	
	}
	
	public Product(String name, double price){
		
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, String color, ArrayList<String> sellerName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerName = sellerName;
	}

	public Product(String name, double price, ArrayList<String> sellerName) {
		super();
		this.name = name;
		this.price = price;
		this.sellerName = sellerName;
	}

	public Product(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
