/**
 * 
 */
package com.adapter;

/**
 * @author rjs56
 *
 */
public class Square implements Shape {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adapter.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing Square of side " + side);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adapter.Shape#printArea()
	 */
	@Override
	public void printArea() {
		System.out.println("Area of Squareis " + side * side);

	}

}
