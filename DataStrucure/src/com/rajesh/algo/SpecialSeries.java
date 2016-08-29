/**
 * 
 */
package com.rajesh.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author RajeshK
 *
 */
public class SpecialSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		String[] input1 = input.split(" ");
		if (input1.length != 3) {
			throw new IllegalArgumentException("Please provide 3 arguments");
		}

		long a = Integer.parseInt(input1[0]);
		long b = Integer.parseInt(input1[1]);
		long nth = Integer.parseInt(input1[2]);

		if (a > 2 || a < 0 || b > 2 || b < 0 || nth > 20 || nth < 3) {
			throw new IllegalArgumentException("Arguments are not consistent");
		}

		Long result = getNthTerm(a, b, nth);
		System.out.println(result);

	}

	private static Long getNthTerm(long a, long b, long n) {
		List<Long> list = new ArrayList<>();
		list.add(0, a);
		list.add(1, b);

		list.add(2, b * b + a);
		for (int i = 3; i < n; i++) {
			long prev = list.get(i - 1);
			list.add(i, prev * prev + list.get(i - 2));
		}
		int index = (int) n;
		return list.get(index - 1);
	}

}
