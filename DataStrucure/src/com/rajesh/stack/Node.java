/**
 * 
 */
package com.rajesh.stack;

/**
 * Node for Singly Linked List
 * 
 * @author rjs56
 *
 */
public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

}
