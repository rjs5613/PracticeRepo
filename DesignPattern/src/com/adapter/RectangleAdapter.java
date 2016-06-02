/**
 * 
 */
package com.adapter;

/**
 * @author rjs56
 *
 */
public class RectangleAdapter implements Shape {

	private Rectangle rectangle;

	public RectangleAdapter(double length, double breadth) {
		rectangle = new Rectangle(length, breadth);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adapter.Shape#draw()
	 */
	@Override
	public void draw() {
		rectangle.drawRectangle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adapter.Shape#printArea()
	 */
	@Override
	public void printArea() {
		rectangle.calculateRectangleArea();
	}

}
