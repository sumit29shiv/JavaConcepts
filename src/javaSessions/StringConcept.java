package javaSessions;

public class StringConcept {

	public static void main(java.lang.String[] args) {
		
		// String is a collection of character
		// It is a class in java
		// it comes under non primitive data types
		
		
		String str = "Hello Sumit";
		System.out.println(str);
		
	    String val = "3";
	    int a = 5;
		System.out.println(str+val);
		System.out.println(str+val+a);
		System.out.println(str.charAt(3));
		System.out.print(80+"\n");
		System.out.println("Sumit");
		
		int i = 2;
		int j = 3;
		
		double d1 = 4.5;
		double d2 = 63.1;
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(i+j);
		System.out.println(d1+d2);
		System.out.println(s1+s2);
		System.out.println(i+j+s1+s2);
		System.out.println(s1+s2+i+j);
		System.out.println(s1+s2+(i+j));
		System.out.println(s1+s2+i+j+d1+d2);
		System.out.println(i+j+(s1+s2)+d1+d2);
		System.out.println(i+j+s1+s2+(d1+d2));
		
		int k = 4/2;
		System.out.println(k);
		
		System.out.println(9.0/2.0);
		System.out.println(9*3.5);
		
		float l = 9/5f;
		System.out.println(l);
		
		int m = 0/100;
		System.out.println(m);
		
		//double n = 200/0;
		//System.out.println(n);
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s2));
		
		
		// 
		

	}

}
