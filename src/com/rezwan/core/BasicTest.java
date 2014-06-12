package com.rezwan.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class BasicTest { 
	@BasicAnnotation
	public static void main(String [] args) {


		Class<BasicTest> object=BasicTest.class; 
		
		if ( object.isAnnotationPresent( BasicAnnotation.class ) ) {
			Annotation annotation=object.getAnnotation( BasicAnnotation.class );
			BasicAnnotation basicAnnotation=(BasicAnnotation) annotation; 
			
			System.out.println(basicAnnotation.id()); 
		}
		
		
		
		for ( Method method : object.getDeclaredMethods() ) {
			if ( method.isAnnotationPresent( BasicAnnotation.class ) ) {
				Annotation annotation=method.getAnnotation(BasicAnnotation.class);
				BasicAnnotation basicAnnotation=(BasicAnnotation) annotation; 
				System.out.println(basicAnnotation.id());
			}
		}
 		
		
	}
}
