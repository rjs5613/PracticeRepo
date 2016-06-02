/**
 * 
 */
package com.rajesh.stack;

/**
 * @author rjs56
 *
 */
public class MyStackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(5);
		stack.push(6);
		stack.pop();
		stack.displayStack();
		
	}

}
