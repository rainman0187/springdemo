package com.rezwan.custom;

public class RichPersonDecorator implements Person {

	protected Person internalPerson; 
	
	public RichPersonDecorator( Person p ) {
		this.internalPerson=p; 
	} 
	
	 
	public String getStatus() {
		// TODO Auto-generated method stub
		return internalPerson.getStatus()+ " >> rich";
	}

}
