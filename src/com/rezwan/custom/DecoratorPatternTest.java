package com.rezwan.custom;

import com.rezwan.core.Person;

public class DecoratorPatternTest extends Person {
	
 
	public static void main(String [] args) throws Exception{
		 
		 RichPersonDecorator richPerson=new RichPersonDecorator( new AveragePerson( "more than average" ) ); 
		 
		 System.out.println( richPerson.getStatus() );
	}
}
