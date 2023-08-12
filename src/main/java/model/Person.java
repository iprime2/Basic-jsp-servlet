package model;

// Java Bean

//1. Implements Serializable
//2. No arg constructor
//3. private members w/ getter and setter

import java.io.Serializable;

public class Person implements Serializable {
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person() {
		super();
	}


	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
