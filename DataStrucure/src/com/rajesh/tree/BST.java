/**
 * 
 */
package com.rajesh.tree;

/**
 * @author rjs56
 *
 */
public class BST<T extends Comparable<T>> {

	private BTreeNode<T> rootNode;

	/**
	 * @return the rootNode
	 */
	public BTreeNode<T> getRootNode() {
		return rootNode;
	}

	public T addNode(T data) {
		BTreeNode<T> nodeToAdd = new BTreeNode<T>(data);
		BTreeNode<T> eligibleNode = getEligibleNode(data);
		if (eligibleNode.compareTo(data) > 0) {
			eligibleNode.setLeftChild(nodeToAdd);
		} else {
			eligibleNode.setRightChild(nodeToAdd);
		}
		return data;
	}

	private BTreeNode<T> getEligibleNode(T data) {

		if (rootNode.compareTo(data) > 0) {
			if (rootNode.getLeftChild() == null) {
				return rootNode;
			}
			rootNode = rootNode.getLeftChild();
			return getEligibleNode(data);
		} else {
			if (rootNode.getRightChild() == null) {
				return rootNode;
			}
			rootNode = rootNode.getRightChild();
			return getEligibleNode(data);
		}
	}
}
