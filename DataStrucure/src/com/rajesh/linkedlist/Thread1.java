/**
 * 
 */
package com.rajesh.linkedlist;

/**
 * @author rjs56
 *
 */
public class Thread1 extends Thread {
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("thread 1 "+i);
		}

	}

}
