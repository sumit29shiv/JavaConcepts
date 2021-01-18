package javaSessions;

import java.util.Scanner;

public class ConditionalStatementConcept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		if (a>b) {
			System.out.println("a is grater");
			}
		else {
			System.out.println("b is greater");
		}
		
		String time = "morning";
		
		switch (time) {
		case "evening":
			System.out.println("Good evening !!");
			break;
			
		case "morning":
			System.out.println("Good morning ");
			break;
			
		case "night":
			System.out.println("Good night ");
			break;

		default:
			System.out.println("Enter correct value");
			break;
		}

	}

}
