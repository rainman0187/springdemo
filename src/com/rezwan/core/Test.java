package com.rezwan.core;

public class Test {
	
	
	
	public static void main(String [] args) {
	 
		Node n1=new Node<String>("HELLO");
		Node n2=new Node<String>("HI");
		Node n3=new Node<String>("BYE");
		Node n4=new Node<String>("YOU");
		Node n5=new Node<String>("AR#E#");
		Node n6=new Node<String>("GOOD");
		Node n7=new Node<String>("BOY");

		n1.setNext(n2); 
		n2.setNext(n3); 
		n3.setNext(n4);
		n4.setNext(n5); 
		n5.setNext(n6);
		n6.setNext(n7); 
		n7.setNext(n5); 
		
		Node repeat=LinkedList.findBeginningRez(n1);
		
		System.out.println(repeat.getObject()) ;
	}
}
