package com.rajesh.stack;

public class MyQueueDemo {

	public static void main(String[] args) {

		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(6);
		queue.enqueue(5);
		queue.enqueue(11);
		queue.displayQueue();
		queue.dequeue();
		System.out.println("==== after Dequeue ====");
		queue.displayQueue();
		queue.enqueue(15);
		queue.enqueue(20);
		System.out.println("=== After enqueu ===");
		queue.displayQueue();
	}

}
