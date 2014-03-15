package com.rezwan.core;
import java.util.Arrays;

public class RemoveDuplicateTest {

	public static void removeDuplicates(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		int tail = 1;
		
		for (int i = 1; i < len; i++) {
			int j;

			 
			
			for (j = 0; j < tail; j++) {
				
			 
				
				if (str[i] == str[j])
					break;
			}
			
			 

			if (j == tail) {
				str[tail] = str[i];
				
				System.out.println( " moved " + tail +" to " + i ); 
				++tail;
			}
			

			System.out.println( " tail value  " + tail ); 
			System.out.println(  "inside pass "+ Arrays.toString(str)); 
 	

		}

		
		
		if(tail<len) str[tail] = 0;
	 
	}
	
	public static void rezwanRemoveDuplicate( char [] array ) {
		for ( int i=0; i<array.length; i++ ) {
			
			int j=i+1;
			
			while ( j<array.length  && array[j] != array[i]   ) {
				j++; 
			}
			
			if ( j < array.length && j!=array.length-1 ) {
				array[j]=array[j+1]; 
			}
			
			System.out.println(Arrays.toString(array)); 
		}
	}
	
	
	public static boolean contains ( int begin, int end, char[] array, char currentChar ) {
		
		int i; 
		for ( i=begin; i<end; i++ ) {
			if ( array[i]==currentChar )
				return true;
		}
		
		return false; 
	}
	
	
	public static void removeDuplicates2( char[] array ) {
		if ( array==null || array.length==1 || array.length==0 )
			return; 
		
		int j=0; 
		int tail=1;  
		
		for ( int i=1; i < array.length; i++ ) {
	
			if ( !contains(j, tail, array, array[i]) )  {
			
				array[tail]=array[i];
				tail++; 
			}  
			
		}
		
		if ( tail<array.length ) {
			array[tail]='@'; 
		}
		
	}
 
	public static void main(String[] args) {
		
		 char[] array=new char[]{ '1', '2', '1', '1', 'd' };  
		 
		 removeDuplicates2(array);
		 
		 System.out.println(Arrays.toString(array)); 
	  
		 
	}

}
