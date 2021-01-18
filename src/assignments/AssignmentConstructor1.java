package assignments;

import java.util.ArrayList;

public class AssignmentConstructor1 {
	
	String name;
	String country;
	String esDate;
	ArrayList <String> course;
	
	

	public static void main(String[] args) {
		
		ArrayList<String> Oxfordcourse  = new ArrayList<String>();
		Oxfordcourse.add("Literature");
		Oxfordcourse.add("Data science");
		Oxfordcourse.add("Computer science");
		Oxfordcourse.add("Devops");
		
		AssignmentConstructor1 univ1 = new AssignmentConstructor1("Oxford","UK","23/04/1950",Oxfordcourse);
		System.out.println("Universiry Name:"+" "+univ1.getName()+" ,"+"University Country:"+" "+univ1.getCountry()
				+" ,"+"University established date:"+" "+univ1.getEsDate()+" ,"+univ1.getCourse());
		
		
		AssignmentConstructor1 univ2 = new AssignmentConstructor1("Nalanda","India");
		System.out.println("Universiry Name:"+" "+univ2.name+" ,"+"University Country:"+" "+univ2.country);
		
		
		
	}
		
		/*
	1. Design a University class template with the following features:
	 	variables:
		name
		country
		stablishedDate
		List of course provided in Array List<String>
	
		--Design the constructor of this class with different parameters and all parameters.
		--Write the get method of each variable with return keyword. 
	*/
	
	public AssignmentConstructor1(String name, String country, String esDate){
		
		this.name = name;
		this.country = country;
		this.esDate = esDate;
		
		
	}

	public AssignmentConstructor1(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}


	public AssignmentConstructor1(String name) {
		super();
		this.name = name;
	}


	public AssignmentConstructor1(String name, String country, String esDate, ArrayList<String> course) {
		super();
		this.name = name;
		this.country = country;
		this.esDate = esDate;
		this.course = course;
	}


	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}


	public String getEsDate() {
		return esDate;
	}

	public ArrayList<String> getCourse() {
		return course;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
