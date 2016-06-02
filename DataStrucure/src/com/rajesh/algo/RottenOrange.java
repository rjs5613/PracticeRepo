/**
 * 
 */
package com.rajesh.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author rjs56
 *
 */
public class RottenOrange {

	private static Map<Node, Node> rottenMap = new HashMap<>();
	private static Map<Node, Node> freshMap = new HashMap<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] intArray = { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 } };
		System.out.println(intArray);
		int result = countNoOfSteps(intArray);
		System.out.println(result);

	}

	public static int countNoOfSteps(int[][] intArray) {
		System.out.println("First Step");
		populateMap(intArray);
		if (freshMap.size() > 0) {
			if (rottenMap.size() == 0) {
				return -1;
			}
			int count = 0;
			while (freshMap.size() > 0) {
				boolean result = rottOrange();
				if (result == false) {
					return -1;
				}
				count++;
			}

			return count;
		}
		return 0;

	}

	private static void populateMap(int[][] intArray) {
		System.out.println("In 2nd step");
		int noOfColumn = intArray[0].length;
		System.out.println("in populate map");
		int j = 0;
		while (true) {
			try {
				for (int i = 0; i < noOfColumn; i++) {

					if (intArray[j][i] == 2) {
						rottenMap.put(new Node(j, i), null);
					} else if (intArray[j][i] == 1) {
						freshMap.put(new Node(j, i), null);
					}

				}
			} catch (ArrayIndexOutOfBoundsException e) {
				j = -1;
			}
			if (j == -1) {
				break;
			}
			j++;
		}
	}

	private static boolean rottOrange() {
		System.out.println("in rott map");
		int freshSize = freshMap.size();

		for (Entry<Node, Node> entry : rottenMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			if (entry.getValue() != null) {
				continue;
			}
			entry.setValue(new Node(0, 0));
			System.out.println(entry.getKey() + " - " + entry.getValue());
			int x = entry.getKey().x;
			int y = entry.getKey().y;
			removeFromFresh(x, y);
		}
		if (freshSize > freshMap.size()) {
			return true;
		}
		return false;
	}

	private static void removeFromFresh(int x, int y) {
		System.out.println("in remove ");
		freshMap.remove(new Node(x + 1, y));
		freshMap.remove(new Node(x - 1, y));
		freshMap.remove(new Node(x, y + 1));
		freshMap.remove(new Node(x, y - 1));
		System.out.println(freshMap);

	}

	private static class Node {
		int x = -1;
		int y = -1;

		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + "]";
		}

	}

}
