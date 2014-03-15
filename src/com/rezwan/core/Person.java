package com.rezwan.core;
public class Person {
	
	private String firstName;
	private String lastName; 
	private String email; 
	
	public Person() {
		
	}
	
	public Person ( String firstName, String lastName, String email ) {
		this.firstName=firstName; 
		this.lastName=lastName; 
		this.email=email; 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean equals(Object arg0) {
		Person passed=(Person) arg0; 
		
		if ( passed.email.equals(this.email) )
			return true;
		
		return false; 
	}
	
	protected String myMethod1() {
		return "MYMETHOD1"; 
	}
	
	String myMethod2() {
		return "Mth2";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
