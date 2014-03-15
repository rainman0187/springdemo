package com.rezwan.core;

public class Node<T> {
	private T object; 
	private Node<T> next;
	
	
	public Node() {
	}
	
	public Node(T object) {
		this.object=object; 
	}
	
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	 
	
}
