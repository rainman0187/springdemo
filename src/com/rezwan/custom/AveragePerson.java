package com.rezwan.custom;

public class AveragePerson implements Person {

	private String status; 
	
	public AveragePerson() {
		status="average"; 
	}
	
	public AveragePerson( String status ) {
		this.status=status; 
	}
	
	
	@Override
	public String getStatus() {
		return status; 
	}

}
