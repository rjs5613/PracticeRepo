/**
 * 
 */
package com.adapter;

/**
 * @author rjs56
 *
 */
public class Rectangle {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void drawRectangle() {
		System.out.println("Drawing Rectangle of length " + length + " and breadth" + breadth);
	}

	public void calculateRectangleArea() {
		System.out.println("Area of Rectangle is " + length * breadth);
	}

}
