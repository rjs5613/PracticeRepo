package com.rajesh.linkedlist;

public class ThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		Thread thread = new Thread(t2);
		thread.start();

	}

}
