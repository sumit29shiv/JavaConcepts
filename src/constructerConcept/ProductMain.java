package constructerConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		System.out.println("Product name is:"+" "+p1.name+" "+",price is"+" "+p1.price);
		Product p2 = new Product("IPhone",23.5);
		System.out.println("Product name is:"+" "+p2.name+" "+"price is"+" "+p2.price);
		Product p3 = new Product("Shoes",23.4,"Black");
		System.out.println("Product name is:"+" "+p2.name+" "+"price is"+" "+p2.price+" "+""
				+ "Color is: "+p3.color);
		
		ArrayList <String> bagsellerList = new ArrayList<String>(Arrays.asList("Ecom","Manish"));
		Product p4 = new Product("Bag",33.4,"Blue",bagsellerList);
		System.out.println(p4.name+p4.color+p4.price+p4.sellerName);
		System.out.println(p4.sellerName.get(1));
		
		for(String k: bagsellerList) {
			System.out.println(k);
		}
		

	}

}
