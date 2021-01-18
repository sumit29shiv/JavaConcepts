package javaSessions; // package

public class DataTypes { // class

	public static void main(String[] args) { // main method
		/**
		 *  Data types in java represents the type of data.
		 *  A. Primitive Data types
			   We have 8 primitive data types in java
			   byte, short, int, long, float, double, char, boolean
		 */
		
		// Integer family(byte,short,int,long)
		//1. byte
		// range: -128 to +127
		// size: 1 byte = 8 bits
		
		byte b = 23;
		System.out.println(b);
		
		byte b1 = -127;
		System.out.println(b1);
		
		//2. short
		// range: more than byte -32768 to +32767
		//size: 2 bytes = 16 bits
		
		short s = 28;
		System.out.println(s);
		
		//3. int
		//range: more than short
		//size 4 bytes = 32 bits
		
		int i = 234;
		System.out.println(i);
		
		//4. long
		//range: more than int
		//size: 8 bytes = 64 bits
		
		// Decimal family(float, double)
		//5. float
		//range: suitable up 6 digits after decimals
		// size: 4bytes = 32 bits
		
		float value = 23.5f;
		System.out.println(value);
		
		float value1 = (float)56.4;
		System.out.println(value1);
		
		
		//6. double
		// range: suitable upto 16 dugts after decimals
		// size: 8 bytes = 64 bits
		
		double d = 23.999999999;
		System.out.println(d);
		
		// Character family(char)
		//7. char
		// size: 2 bytes = 16 bits
		
		char c = 'a';
		System.out.println(c);
		
		char c1 = '2';
		System.out.println(c1);
		
		System.out.println(c+c1);
		
		//Boolean family
		//8. boolean
		//size: 1 bit(almost)
		
		boolean val = true;
		System.out.println(val);
		
		
	
		
		
		
		
		

	}

}
