package constructerConcept;

public class Person {
	
	String name;
	int age;
	double sal;
	boolean isPermanent;
	char gender;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public Person(String name, int age, double sal, boolean isPermanent, char gender) {
		
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}
	
	public Person(String name) {
		this.name = name;
	}
	

	public static void main(String[] args) {
		
		Person p1 = new Person("Sumit",26);
		System.out.println(p1.name+" "+p1.age);
		
		Person p2 = new Person("Amit",26,34.44,true,'m');
		System.out.println(p2.isPermanent);
	
		
		
		
			
		}

		

}
