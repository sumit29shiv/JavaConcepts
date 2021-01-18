package javaPrograms;

public class CountcharacterInString {

	public static void main(String[] args) {
	String s = "Hello Guys How are doing today";
	char ch[] = s.toCharArray();
	int count = 0;
	
	for(int i=0;i<ch.length;i++) {
		count++;
		
	}
	
	System.out.println("No of character in string: "+count);

	}

}
