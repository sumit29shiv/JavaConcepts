package collectionsConcept;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] a) {
		

		// creating generic ArrayList
		//ArrayList <Object> al = new ArrayList <Object>();
		
		// creating String ArrayList
		ArrayList <String> colors = new ArrayList <String>();
		
		//size
		System.out.println("No of elements in ArrayList: "+colors.size());
		
		//Adding elements in ArrayList(add)
		colors.add("Blue");
		colors.add("Red");
		colors.add("Black");
		colors.add("white");
		System.out.println("After adding elements:"+colors);
		
		//Iterator it = 
		
		
		//Adding element at particular location
		colors.add(2,"Pink");
		System.out.println("After adding elements at 2nd location: "+colors);
		
		//Retrieving element using index:
		System.out.println("Retriving Element available at 3rd location: "+colors.get(3));
		
		//removing element using index
		colors.remove(0); // Blue
		System.out.println("After removing Blue: "+colors);
		
		//removing element using value
		colors.remove("white"); // White
		System.out.println("After removing white: "+colors);
		
		//replacing element
		colors.set(1,"Purple");// Pink
		System.out.println("After replacing Pink with Purple: "+colors);
		
		//checking ArrayList is emepty or not
		System.out.println("Is Colors List Empty: "+colors.isEmpty());
		
		//retainAll
		System.out.println(colors.retainAll(colors));
		System.out.println(colors.contains("Black"));
		
		//colors.clear();
		//System.out.println(colors);
		
		ArrayList <String> cities = new ArrayList<>(Arrays.asList("Pune","Bhopal","Agra","Morena"));
		System.out.println(cities.get(0));
		
		
		
		
		
		
		
		
		

	}

}
