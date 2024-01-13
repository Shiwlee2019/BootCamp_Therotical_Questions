package com.qa.BootCamp_Diffiult_Programs;

class Node {
	int key;
	Node left;
	Node right;

	public Node(int value) {
		key = value;
		left = right = null;
	}
}
public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root = null;

	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);

			return root;

		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);

		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public void inOrdertraversal() {
		inOrderTraversalRec(root);

	}

	private void inOrderTraversalRec(Node root) {
		if (root != null) {
			inOrderTraversalRec(root.left);
			System.out.println(root.key + " ");
			inOrderTraversalRec(root.right);

		}
	}

	public boolean search(int key) {

		return searchRec(root, key);
	}

	private boolean searchRec(Node root, int key) {
		if (root == null || root.key == key) {
			return root != null;
		}

		if (key > root.key) {
			return searchRec(root.right, key);
		}
		return searchRec(root.left, key);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(50);
		bst.insert(20);
		bst.insert(30);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);
		bst.insert(90);

		System.out.println("In-order-traversal:");

		int keyToSearch = 90;
		if (bst.search(keyToSearch)) {
			System.out.println(keyToSearch + " " + " found in the BST.");
		} else {
			System.out.println(keyToSearch + " " + "not found in the BST.");
		}

	}

}
