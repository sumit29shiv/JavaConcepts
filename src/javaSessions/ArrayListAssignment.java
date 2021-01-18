package javaSessions;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {
		
		//1. WAP to create a new array list, add some colors (string) and print out the collection
		
		ArrayList <Object> colors = new ArrayList <Object>();
		
		colors.add("Yello");
		colors.add("blue");
		colors.add("Grey");
		colors.add("Red");
		
		colors.stream().forEach(color -> System.out.println(color));
		
		//2. WAP to insert an element into the array list at the first and last positions.
		System.out.println("-------------------");
		
		ArrayList <Object> myarrayList = new ArrayList <Object>();
		
		myarrayList.add("2"); // at 0 index
		int lastPos = myarrayList.size()-1;
		myarrayList.add(lastPos,"Hello");
	
		
		//3. WAP to retrieve an element (at a specified index) from a given array list.
		System.out.println("-------------------");
		
		ArrayList <Object> myarrayList1 = new ArrayList <Object>();
		
		myarrayList1.add(100);
		myarrayList1.add("India");
		myarrayList1.add("America");
		myarrayList1.add("UK");
		myarrayList1.add("Paris");
		
		//retriving value at 3 index
		System.out.println(myarrayList1.get(3));
		
		//retriving value at 5 index which does not exist will get IndexOutOfBoundException
		
		//System.out.println(myarrayList1.get(5));
		
		
		//4.WAP to update specific array element by given element.
		System.out.println("-------------------");
		ArrayList <Integer> myarrayList2 = new ArrayList <Integer>();
		
		myarrayList2.add(23);
		myarrayList2.add(24);
		myarrayList2.add(25);
	
		
		for (int i=0; i<myarrayList2.size(); i++) {
			
			System.out.println(myarrayList2.get(i));
		}
		
		// updating 2nd value(24) of array list with 10000
		myarrayList2.set(1, 10000);
		
		System.out.println("-------------");
		for (int i=0; i<myarrayList2.size(); i++) {
			
			System.out.println(myarrayList2.get(i));
		}
		
		//5. WAP to remove the third element from a array list.
		System.out.println("-------------------");
		ArrayList <String> myarrayList3 = new ArrayList <String>();
		
		myarrayList3.add("Benguluru");
		myarrayList3.add("Pune");
		myarrayList3.add("Mumbai");
		myarrayList3.add("Indore");
		myarrayList3.add("Delhi");
		
		System.out.println("--------------------");
		//removing 3rd element from string arraylist
		myarrayList3.remove(2);
		
		for(String k: myarrayList3) {
			
			System.out.println(k);
			
		
			
		}
		
		System.out.println("----------");
	
		
		for(String k: myarrayList3) {
			
			System.out.println(k);
			
		}
		
		//6. WAP to search an element in a array list.
		System.out.println("-------------------");
		
		System.out.println("-------------------");
		
		ArrayList <Integer> myarrayList4 = new ArrayList <Integer>();
		
		myarrayList4.add(45);
		myarrayList4.add(46);
		myarrayList4.add(47);
		myarrayList4.add(48);
		
		System.out.println(myarrayList4.get(3));
		
		//7. WAP to reverse elements in a array list
		
		ArrayList <Integer> num = new ArrayList <Integer> ();
		
		num.add(15);
		num.add(16);
		num.add(17);
		num.add(18);
		num.add(19);
		
		
		//System.out.println("My array List"+num);
		
		System.out.println("my ArrayList before reversing\n");
		
		for (int k: num) {
			
			System.out.println(k);
		}
		
		System.out.println("my ArrayList after reversing\n");
		
		for (int i=(num.size()-1); i>=0;i--) {
			
			System.out.println(num.get(i));
		}
		
		//8. WAP to extract a portion of a array list.
		
		System.out.println(num.subList(1,3));
		
		//9. WAP of swap two elements in an array list.
		
		
		//10. WAPto empty an array list.
		
		
		ArrayList <String> fruits = new ArrayList <String>();
		
		fruits.add("Mango");
		fruits.add("Papya");
		fruits.add("Grapes");
		fruits.add("Pea");
		fruits.add("Apple");
		
		// Arraylist before emptying
		for (String s: fruits) {
			System.out.println(s);
		}
		
		fruits.clear();
		// Arraylist after emptying
		System.out.println(fruits);
		
		
		//11. WAP to trim the virtual capacity of an array list the current list size.
		
		
		//12. WAP to print all the elements of a ArrayList using the position of the elements
		
	
		
		
		
		
		
		
		
	
		
		
		
			
	
		
		
		
		
		

	}

}
