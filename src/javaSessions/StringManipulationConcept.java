package javaSessions;

public class StringManipulationConcept {

	public static void main(String[] args) {
		
		String mystr = "India is my couNtry";
		
		//length
		int len = mystr.length();
		System.out.println(len);
		
		//charAt
		char c = mystr.charAt(4);
		System.out.println("Character at index 4 is: "+c);
		
		//indexOf
		int ind = mystr.indexOf("country");
		System.out.println(ind);
		System.out.println(mystr.indexOf('i', 4));
		System.out.println(mystr.indexOf('i',mystr.indexOf('i')+1));
		System.out.println(mystr.trim());
		System.out.println(mystr.trim().replace(' ', 'e'));
		System.out.println(mystr.toUpperCase());
		System.out.println(mystr.toLowerCase());
		System.out.println(mystr.contains("country"));
		System.out.println(mystr.equals("India is my country"));
		System.out.println(mystr.equalsIgnoreCase("India is my country"));
		System.out.println(mystr.concat(" Bhai bhai bhai"));

		
		
		

	}

}
