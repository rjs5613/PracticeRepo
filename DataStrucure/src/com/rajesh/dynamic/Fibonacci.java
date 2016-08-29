/**
 * 
 */
package com.rajesh.dynamic;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author RajeshK
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Long> avalaibleMap = new HashMap<Integer, Long>();
		avalaibleMap.put(0, 0L);
		avalaibleMap.put(1, 1L);
		System.out.println(new Date());
		System.out.println(fibonacci(50));
		System.out.println(new Date());
		System.out.println(fibonacciModified(50, avalaibleMap));
		System.out.println(new Date());

	}

	private static long fibonacci(long n) {
		if (n < 3) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static long fibonacciModified(int n, Map<Integer, Long> avalaibleMap) {
		if (avalaibleMap.containsKey(n)) {
			return avalaibleMap.get(n);
		} else {
			avalaibleMap.put(n - 1, fibonacciModified(n - 1, avalaibleMap));
			long newVal = avalaibleMap.get(n - 1) + avalaibleMap.get(n - 2);
			avalaibleMap.put(n, newVal);
			return newVal;
		}
	}

}
