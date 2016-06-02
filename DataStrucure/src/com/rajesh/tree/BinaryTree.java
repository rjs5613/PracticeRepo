/**
 * 
 */
package com.rajesh.tree;

/**
 * @author rjs56
 *
 */
public class BinaryTree<T extends Comparable<T>> {

	private BTreeNode<T> rootNode;

	/**
	 * @return the rootNode
	 */
	public BTreeNode<T> getRootNode() {
		return rootNode;
	}

	/**
	 * @param rootNode
	 *            the rootNode to set
	 */
	public void setRootNode(BTreeNode<T> rootNode) {
		this.rootNode = rootNode;
	}

	public T addNode(T data) {
		if (rootNode == null) {
			rootNode.setData(data);
		}
		return data;
	}

}
