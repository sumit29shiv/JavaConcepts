package javaSessions;

import java.util.Scanner;

public class Methods_Assignment {

	public static void main(String[] args) {
		
		
		Methods_Assignment m = new Methods_Assignment();
//		System.out.println("----------------");
//		m.addTwoNumbers();
//		
//		System.out.println("----------------");
//		int product = m.multiplyToNumbers(3, 4);
//		System.out.println("Product is "+product);
//		
//		
//		System.out.println("----------------");
//		m.getAreaAndCirucOfCircle();
//		
//		System.out.println("----------------");
//		m.getMaxmimumNumber();
//		
//		System.out.println("----------------");
//		m.getMiniumumNumber();
//		
//		System.out.println("----------------");
//		String output = m.findEvenOrODD(3);
//		System.out.println(output);
//		
//		System.out.println("----------------");
//		m.checkVoterEligibility(24);
//		
//		System.out.println("----------------");
//		m.isPrime(0);
//		
//		System.out.println("----------------");
//		m.displayStudentGrades();
		
		System.out.println("----------------");
		int factorial = m.findFactorial(0);
		System.out.println("Factorial of1	 is "+factorial);
		
		
		
		}
	
	//1.WAP to print the sum of two numbers entered by user by defining your own method.
	public void addTwoNumbers() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = s.nextInt();
		System.out.print("Enter first number: ");
		int b = s.nextInt();
		System.out.println("Calculating sum of "+a + " and "+b);
		System.out.println("Sum of "+a + " and "+b+ " is "+(a+b));
		
	}
		
	//2. Define a method that returns the product of two numbers entered by user.
		public int multiplyToNumbers(int a, int b) {
			int c= a*b;
			return c;
			
		}
		
	//3. WAP to print the circumference and area of a circle of radius entered by user by defining your own method.
		public void getAreaAndCirucOfCircle() {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.print("Enter radius of the circle: ");
			double r = s.nextDouble();
			final double pi = 3.14f;
			System.out.println("Calculating area and circumference of circle..");
			double area = 2*pi*r;
			double circum = pi*r*r;
			System.out.println("Area of circle: "+area);
			System.out.println("Circumference of circle: "+circum);
			
		}
		
	//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		
		public void getMaxmimumNumber() {
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number a: ");
			int a = s.nextInt();
			System.out.print("Enter number b: ");
			int b = s.nextInt();
			System.out.print("Enter number c: ");
			int c = s.nextInt();
			
			if(a>b && a>c) {
				System.out.println("a is greater: "+a);
			}
			else if(b>c) {
				System.out.println("b is greater: "+b);
			}
			else if(a==b && a==c){
				System.out.println("a,b and c are equal");
			}
			else {
				System.out.println("c is greater: "+c);
			}
			
		}
		
		public void getMiniumumNumber() {
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number a: ");
			int a = s.nextInt();
			System.out.print("Enter number b: ");
			int b = s.nextInt();
			System.out.print("Enter number c: ");
			int c = s.nextInt();
			
			if(a<b && a<c) {
				System.out.println("a is smaller: "+a);
			}
			else if(b<c) {
				System.out.println("b is smaller: "+b);
			}
			
			else if(a==b && a==c){
				System.out.println("a,b and c are equal");
			}
			else{
				System.out.println("c is smaller: "+c);
			}
			
			
		}
		
	//5. Define a program to find out whether a given number is even or odd.
		
		public String findEvenOrODD(int num) {
			 String msg = "";
			 
			 if(num%2==0) {
				 msg = "Number is even";
			 }
			 
			 else {
				 msg = "Number is odd";
			 }
			 
			 return msg;
			 
		}
			 
	//6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
			 
		public void checkVoterEligibility(int age) {
				 
			 if(age>=18) {
					 System.out.println("Congratulations. you can vote.. "+age);
				 }
				 
			 else {
					 System.out.println("Sorry !! you can not vote.. "+age);
				 }
			 }
			 
		
	//7. Define a method to find out if number is prime or not.
		
		public void isPrime(int num) {
			
			int count = 0;
			
			if (num>0) {
				
				for(int i=2;i<num;i++) {
					
					if(num%i==0) {
						count += 1;
					}
					
				}
				if(count>0) {
					System.out.println("Not a Prime number");
				}
				else {
					System.out.println("Prime number");
				}
			}
			
			else {
				System.out.println("Invalid number");
			}
			
		}
		
		//8. WAP which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
			 public void displayStudentGrades() {
				
				
				Scanner s = new Scanner(System.in);
				System.out.print("Please enter your marks: ");
				int marks = s.nextInt();
				
				if (marks<101) {
				
				if(marks >= 91 && marks<=100) {
					System.out.println("Congrats !! Your grade is AA");
				}
				else if(marks>= 81) {
					
					System.out.println("Congrats !! Your grade is AB");
					
				}
				
				else if (marks>=71) {
					System.out.println("Congrats !! Your grade is BB");
				}
				
				else if(marks>=61){
					System.out.println("Your grade is BC");
				}
				
				else if (marks>=51) {
					System.out.println("Your grade is CD");
				}
				else if(marks>=41) {
					System.out.println("Your grade is DD");
				}
				
				else{
					System.out.println("OOPS !! You are falied");
				}
				
				
				}
				
				else {
					System.out.println("Invalid marks.. "+marks);
				}
		
				
				}

			//9. WAP to print the factorial of a number by defining a method named 'Factorial'.
			public int findFactorial(int num) {
				
				int fact = 1;
				
				if(num==0) {
					fact = 0;
				}
				
				else if(num>1) {
					
					for(int i = 1; i<=num; i++) {
						fact = fact*i;
					}
					
					
				}
				
				else {
					System.out.println("Invalid Number.. "+num);
					return fact;
				}
				 
				return fact;
			}
			
	}
		
		
		
	

