/**
 * 
 */
package com.rajesh.tree;

/**
 * @author rjs56
 *
 */
public class BTreeNode<T extends Comparable<T>> implements Comparable<T> {

	private T data;

	private BTreeNode<T> leftChild;

	private BTreeNode<T> rightChild;

	public T getData() {
		return data;
	}

	public BTreeNode(T data) {
		super();
		this.data = data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BTreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public BTreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "BTreeNode [data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}

	@Override
	public int compareTo(T o) {
		return data.compareTo(o);
	}

}
