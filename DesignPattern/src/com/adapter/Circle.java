package com.adapter;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle of Radius " + radius);

	}

	@Override
	public void printArea() {
		System.out.println("Area of Circle is " + 3.14 * radius * radius);

	}

}
