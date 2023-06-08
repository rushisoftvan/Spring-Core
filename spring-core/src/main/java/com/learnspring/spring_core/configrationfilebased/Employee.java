package com.learnspring.spring_core.configrationfilebased;

public class Employee {
    
	private String firstName;
	
	private Integer age;
	
	private String lastName;
	
	public Employee(String firstName,Integer age,String lastName) {
  		this.firstName=firstName;
  		this.age=age;
  		this.lastName=lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + "]";
	}
	
}
