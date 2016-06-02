/**
 * 
 */
package com.adapter;

/**
 * @author rjs56
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Shape circle = new Circle(5);
		circle.draw();
		circle.printArea();

		Shape rectangle = new RectangleAdapter(5, 4);

		rectangle.draw();
		rectangle.printArea();

	}

}
