/**
 * 
 */
package com.rajesh.stack;

import java.util.Objects;

/**
 * Implementation of Queue using Linked List
 * 
 * @author rjs56
 *
 */
public class MyQueue<T> {

	private Node<T> tail;

	private Node<T> head;

	public T enqueue(T data) {

		Node<T> insertData = new Node<T>(data);
		if (Objects.isNull(head)) {
			head = insertData;
			tail = head;
		} else {
			head.setNext(insertData);
			head = insertData;
		}

		return data;
	}

	public T dequeue() {
		if (Objects.isNull(tail)) {
			throw new IndexOutOfBoundsException("Queue is Empty");
		} else {
			T data = tail.getData();
			tail = tail.getNext();
			return data;
		}
	}

	public void displayQueue() {

		Node<T> temp = tail;
		while (Objects.nonNull(temp)) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
