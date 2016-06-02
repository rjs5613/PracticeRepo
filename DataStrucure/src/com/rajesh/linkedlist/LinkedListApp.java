package com.rajesh.linkedlist;

public class LinkedListApp {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>("Neeraj");
		list.insertNode("Rajesh");
		list.insertNode("Mukesh");
		list.insertNode("aaaa");
		System.out.println(list.toString());
		list.insertAfterData("Rajesh", "Alok");
		System.out.println(list.toString());
		list.deleteData("Mukesh");
		System.out.println(list.toString());
	}

}
