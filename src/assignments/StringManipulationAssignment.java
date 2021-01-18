package assignments;

public class StringManipulationAssignment {

	public static void main(String[] args) {
		
		//1.  Write a program to check two different strings equality.
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		if (str1.equals(str2)) {
			
			System.out.println("Both strings are equal");
		}
		
		else {
			System.out.println("Strings are different");
		}
		
		//2. Remove all  spaces in a String . 
		// For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		String str3 = "      Hello Everyone      ";
		String str_trim = str3.trim().replaceAll(" ", "");
		System.out.println(str_trim);
		
		 
		//3. Write a program that will  print out the last character and first character of a word.
		 String str4 = "India is a great country";
		 int lenOfString = str4.length();
		 System.out.println("character at 1st place: "+str4.charAt(0));
		 System.out.println("character at last place: "+str4.charAt(lenOfString-1));
		 
		
		 //4. Write a program to verify a word or a character contained in the sentence.
//		 String str5 = "Python is easy to learn";
//		 if(str5.contains("e")) {
//			 System.out.println("word or character found");
//		 }
//		 else {
//			 System.out.println("Not found");
//		 }
//		 
		 //5. 5.Write a function/ method to reverse your own name.
		 
		 String str6 = "Sumit Shivhare";
		 
		 char[] charArray = str6.toCharArray();
		 
		 int lenOfString1 = str6.length();
		 
		 for(int i = lenOfString1-1; i>=0;i--) {
			 
			 System.out.println(charArray[i]);
			 
		 }
		 
		 
		 
		

	}
	
	

}
