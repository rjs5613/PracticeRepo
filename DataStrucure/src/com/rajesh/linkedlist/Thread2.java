/**
 * 
 */
package com.rajesh.linkedlist;

/**
 * @author rjs56
 *
 */
public class Thread2 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println("thread 2 "+i);
		}	}

}
