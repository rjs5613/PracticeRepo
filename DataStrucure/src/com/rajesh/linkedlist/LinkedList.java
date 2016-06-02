package com.rajesh.linkedlist;

public class LinkedList<E> {
	
	private Node<E> head;
	private int size;
	public LinkedList(E data) {
		head = new Node<E>(data);
		size = 1;
	}
	public Node<E> getHead() {
		return head;
	}
	public void setHead(Node<E> head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}

	public void insertNode(E data){
		Node<E> temp = new Node<E>(data);
		Node<E> current = getHead();
		while(current.getNext()!=null){
			current = current.getNext();
		}
		current.setNext(temp);
		size++;
	}
	
	public void insertAfterData(E data, E toInsert){
		Node<E> insert = new Node<E>(toInsert);
		Node<E> temp = null;
		Node<E> current = head;
		while(current.getNext() != null){
			if(current.getData().equals(data.toString())){
				temp = current.getNext();
				current.setNext(insert);
				insert.setNext(temp);
				size++;
				break;
			} else {
				current = current.getNext();
			}
		}
	}
	
	public void deleteData(E data){
		Node<E> current = head;
		head.getData();
		while(current.getNext()!=null){
			if(current.getNext().getData().equals(data)){
				current.setNext(current.getNext().getNext());
				size--;
				break;
			} else{
				current = current.getNext();
			}
		}
	}
	
	@Override
	public String toString() {
		String result = "LinkedList : ";
		Node<E> current = head;
		while(current.getNext()!=null){
			result += current.getData()+" -> ";
			current = current.getNext();
		}
		result +=current.getData();
		return result;
	}
}
