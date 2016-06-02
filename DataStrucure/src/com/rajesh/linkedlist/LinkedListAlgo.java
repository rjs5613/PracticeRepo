/**
 * 
 */
package com.rajesh.linkedlist;

/**
 * @author rjs56
 *
 */
public class LinkedListAlgo {

	public static <T> LinkedList<T> deleteMidNode(LinkedList<T> linkedList) {

		if (linkedList == null) {
			throw new IllegalArgumentException("Linked List cant be null");
		}

		Node<T> slowNode = linkedList.getHead();

		Node<T> fastNode = linkedList.getHead();

		while (fastNode.getNext() != null) {
			slowNode = slowNode.getNext();
			fastNode = fastNode.getNext().getNext();
			if(fastNode==null){
				break;
			}
		}
		linkedList.deleteData(slowNode.getData());

		return linkedList;

	}
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>(1);
		linkedList.insertNode(2);
		linkedList.insertNode(3);
		linkedList.insertNode(4);
		linkedList.insertNode(5);
		deleteMidNode(linkedList);
		System.out.println(linkedList.toString());
	}

}
