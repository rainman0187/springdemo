package com.rezwan.core;

import java.util.HashMap;
import java.util.Map;

public class LinkedList<T> {
	private Node<T> head;
	private int size; 

 
	public Node<T> getHead() {
		return head;
	}


	public void setHead(Node<T> head) {
		this.head = head;
	}


	public LinkedList() {
		size=0;
	}
	
	
	public void add( T object ) {
		
		Node<T> headPointer=head; 
		
		if ( head==null ) {
			head=new Node<T>();
			size++; 
			head.setObject(object); 
		} else {
			while (head.getNext()!=null) {
				size++;
				head=head.getNext(); 
			}
			
			Node<T> newNode=new Node<T>(); 
			newNode.setObject(object); 
			
			head.setNext(newNode); 
			
			head=headPointer; 
		}
		 
	
	}
	
	
	public void print() {
		Node<T> headPointer=head; 
		if ( headPointer==null )
			return; 
		
		
		while (headPointer.getNext()!=null) {
			if ( headPointer.getObject()!=null )
				System.out.println( headPointer.getObject().toString() ); 
			headPointer=headPointer.getNext(); 
		}
		if ( headPointer.getObject()!=null ) 
			System.out.println( headPointer.getObject().toString() ); 
		 
	}
	
	
	public void remove(T object) {
		Node<T> headPointer=head; 
		if ( headPointer==null )
			return; 
		
		
		while (headPointer.getNext()!=null) {
			if ( headPointer.getObject()!=null ) {
				if ( object.equals(headPointer.getObject()) ) {
					
				}
			}
			
			headPointer=headPointer.getNext(); 
		}
	}
	
	public int size() {
		return size;
	}

	
	public static Node findBeginningRez(Node head) {
		Map<Node, Node> nodes=new HashMap<Node, Node>(); 
		
		Node pointer=head; 
		
		while(pointer.getNext()!=null) {
			
			
			Node value=nodes.get( pointer ) ; 
			
			
			if ( value==null ) {
				nodes.put(pointer, pointer); 
			} else {
				return value; 
			}
			
			
			
			pointer=pointer.getNext(); 
		}
		
		return null; 
		
	}
	
	public static Node findBeginning(Node head) {
		Node n1=head;
		Node n2=head; 
		
		while ( n2.getNext()!=null ) { 
			n1=n1.getNext(); 
			n2=n2.getNext().getNext(); 
	 
			
			if ( n1==n2) 
				break; 
		}
		
		if (n2.getNext()==null)
			return null;
		
		n1=head;
		while(n1!=n2){
			n1=n1.getNext();
			n2=n2.getNext(); 
	 
		}
		
		return n2; 
		
	}
	
	public static void removeDuplicate(LinkedList<?> list) {
		if (list == null || list.size() == 0 || list.size() == 1)
			return;

		Node head = list.getHead();
		Node prev = head;
		Node current = prev.getNext();

		while (current != null) {
			Node runner = head;

			while (runner != current) {
				if (runner.getObject().equals(current.getObject())) {
					prev.setNext(current.getNext());
					current = current.getNext();
					break;
				}

				runner = runner.getNext();
			}

			if (runner == current) {
				prev = prev.getNext();
				current = current.getNext();
			}

		}

	}
	
	public static void reverse( LinkedList<?> list ) {
		
		if (list == null || list.size() == 0 || list.size() == 1)
			return;

		
		Node runner = list.getHead(); 
		Node prev=new Node();
		prev.setObject(runner.getObject()); 
		
		
		while( runner!=null ) {
			if ( runner.getNext()==null ) {
				break; 
			}
			
			Node current = new Node(); 
			current.setObject(runner.getNext().getObject()) ; 
			current.setNext(prev); 
			prev=current; 
			
			runner=runner.getNext(); 
		}
		
		
		list.setHead(prev); 
	}
	
}
