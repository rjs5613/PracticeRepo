/**
 * 
 */
package com.rajesh.stack;

import java.util.Objects;

/**
 * Implementation of Stack using Linked List
 * 
 * @author rjs56
 *
 */
public class MyStack<T> {

	private Node<T> top;

	public T push(T data) {
		Node<T> insertData = new Node<T>(data);
		if (Objects.isNull(top)) {
			top = insertData;
		} else {
			insertData.setNext(top);
			top = insertData;
		}
		return data;
	}

	public T pop() {
		if (Objects.isNull(top)) {
			throw new IndexOutOfBoundsException("Stack Empty");
		} else {
			T data = top.getData();
			top = top.getNext();
			return data;
		}
	}

	public T peek() {
		if (Objects.isNull(top)) {
			return null;
		}
		return top.getData();
	}

	public void displayStack() {
		Node<T> temp = top;
		while (Objects.nonNull(temp)) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

}
