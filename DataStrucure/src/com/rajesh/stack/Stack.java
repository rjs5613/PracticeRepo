/**
 * 
 */
package com.rajesh.stack;

/**
 * @author rjs56
 *
 */
public class Stack {

	private Object[] dataArray;

	private int length;

	private int head = -1;

	public Stack(int length) {
		dataArray = new Object[length];
		this.length = length;
	}

	public Object push(Object data) {
		if (head == length) {
			throw new IndexOutOfBoundsException("Stack Full");
		} else {
			dataArray[++head] = data;
		}
		return data;
	}

	public Object pop() {
		Object pop;
		if (head == -1) {
			throw new IndexOutOfBoundsException("Stack Empty");
		} else {
			pop = dataArray[head];
			dataArray[head] = null;
			head--;
		}
		return pop;
	}

	public int getHead() {
		return head;
	}

}
