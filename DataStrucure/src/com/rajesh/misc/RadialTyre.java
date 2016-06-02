package com.rajesh.misc;

class RadialTyre extends Tyre {
	public void front() {
		System.out.println("Radial Tyre");
	}

	public void front(String a) {
		System.out.println("Radial Tyre with int");
	}

	public static void main(String... args) {
		Tyre t = new RadialTyre();
		String a = "10";
		t.front(a);
		t.front();
	}
}