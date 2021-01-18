package javaSessions;

public class StaticArray {

	public static void main(String[] args) {
		// Array is a collection of similar types of data with fixed length
		// Array limitations:
		// 1. It can store only same type of value(to overcome this we can use object array or array list)
		// 2. It can store only fixed value(to overcome we can use arraylist)
		
		// creating integer array
		int arr[] = new int[4];
		
		//inserting values in arrays
		
		//arr[-1] =5;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		//arr[4] = 5; // ArrayIndexOutOfBoundsException
		
		
		// minimum index of array is always 0
		// maximum index of array is always (length of array)-1
		// Java does not support negative indexing unlike Python
		
		System.out.println("Minimum index: "+0); // minimum index
		System.out.println("Maximum index: "+(arr.length-1)); // maximum index
		
		// to print all values of array we always use  loop
		System.out.println("Array values are:");
		for (int i=0; i<(arr.length);i++) {
			System.out.println(arr[i]);
		}
		
		//creating String array
		String student[] = new String[4];
		
		//inserting values in student array
		student[0] = "Sumit";
		student[1] = "Amit";
		student[2] = "Neha";
		student[3] = "Shikha"; 
		student[3] = "Anuj"; // will consider latest value
		
		for(String s: student) { // for each loop
			System.out.println(s);
		}
		
		// creating character array
		char c[] = new char[4];
		
		// assigning values in character array
		c[0] ='s';
		c[1] = 'u';
		c[2] = 'm';
		c[3] = 'i';
		
		//printing all values in array using for each loop
		for(int i=0; i<(c.length);i++) {
			System.out.println(c[i]);
		}
		
		//creating double array
		double d[] = new double[3];
		
		//assigning values in double array
		d[0] = 2.3;
		d[1] = 3.1;
		d[2] = 4.9;
		
		//printing all values in array using for each loop
		for(double k: d) {
			System.out.println(k);
		}
		
		// Object Array
		// We can store different types of data inside obj array but size will remain fixed once
		// declared
		
		System.out.println("\n\n");
		System.out.println("Object Array");
		Object obj[] = new Object[4];
		
		obj[0] = 's';
		obj[1] = "Sumit";
		obj[2] = 24;
		obj[3] = 23.5;
		
		int i = 0;
		
		while(i<obj.length) { //obj.length = 4
			System.out.println(obj[i]);
			i++;
		}
		
		
		
		
		
		
		
		
	}

}
