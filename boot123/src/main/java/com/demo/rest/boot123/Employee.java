package com.demo.rest.boot123;




public class Employee {
	
	
	public Employee() {
	
	}

	public Employee(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int id;
	public String firstName;
	
}
