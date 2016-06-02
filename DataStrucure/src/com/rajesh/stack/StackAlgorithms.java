/**
 * 
 */
package com.rajesh.stack;

/**
 * @author rjs56
 *
 */
public class StackAlgorithms<T extends Comparable<T>> {

	public MyStack<T> sortStack(MyStack<T> unsortedStack) {

		if (unsortedStack == null || unsortedStack.isEmpty()) {
			throw new IllegalArgumentException("Not Valid Stack input");
		}
		MyStack<T> temp = new MyStack<>();
		while (!unsortedStack.isEmpty()) {

			T top = unsortedStack.pop();
			if (temp.isEmpty()) {
				temp.push(top);
			} else {
				while (top.compareTo(temp.peek()) > 0) {
					unsortedStack.push(temp.pop());
				} 
				temp.push(top);
			}

		}
		return temp;
	}

}
