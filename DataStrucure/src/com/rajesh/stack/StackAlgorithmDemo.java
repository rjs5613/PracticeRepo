/**
 * 
 */
package com.rajesh.stack;

/**
 * @author rjs56
 *
 */
public class StackAlgorithmDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyStack<Integer> unsortedStack = new MyStack<>();
		unsortedStack.push(-5);
		unsortedStack.push(4);
		unsortedStack.push(1);
		unsortedStack.push(0);
		unsortedStack.push(15);

		StackAlgorithms<Integer> stackAlgorithms = new StackAlgorithms<>();
		stackAlgorithms.sortStack(unsortedStack).displayStack();

	}

}
