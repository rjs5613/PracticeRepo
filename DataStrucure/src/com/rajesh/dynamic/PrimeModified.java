/**
 * 
 */
package com.rajesh.dynamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author RajeshK
 *
 */
public class PrimeModified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Date());
		List<Long> primeNumbers = getPrimeNumberSequence(50000);
		System.out.println(primeNumbers);
		System.out.println(new Date());

	}

	private static List<Long> getPrimeNumberSequence(int n) {

		List<Long> primeNumbers = new ArrayList<>();
		primeNumbers.add(2L);
		long number = 2;

		while (primeNumbers.size() < n) {
			number++;
			boolean flag = true;
			for (long available : primeNumbers) {
				if (number % available == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				primeNumbers.add(number);
			}
		}
		return primeNumbers;
	}

}
