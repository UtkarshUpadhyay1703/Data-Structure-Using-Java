package binaryTree;

import exception.ExceptionHandling;
import genericStack.Stack;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
	}

	public Node getRoot() {
		return this.root;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;

		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (data == temp.getData())
				return false;
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public void preOrder(Node temproot) {

		Node temp = temproot;
		if (temp == null)
			return;
		System.out.print(temp.getData() + " ");
		if (temp.getLeft() != null)
			preOrder(temp.getLeft());
		if (temp.getRight() != null)
			preOrder(temp.getRight());
	}

	public void inOrder(Node temproot) {
		Node temp = temproot;
		if (temp == null)
			return;
		if (temp.getLeft() != null)
			inOrder(temp.getLeft());
		System.out.print(temp.getData() + " ");
		if (temp.getRight() != null)
			inOrder(temp.getRight());
	}

	public void postOrder(Node temproot) {
		Node temp = temproot;
		if (temp == null)
			return;
		if (temp.getLeft() != null)
			postOrder(temp.getLeft());
		if (temp.getRight() != null)
			postOrder(temp.getRight());
		System.out.print(temp.getData() + " ");
	}

	public boolean search(int data, Node tempNode) {
		Node temp = tempNode;
		if (temp.getData() == data)
			return true;
		if (temp.getLeft() == null && temp.getRight() == null)
			return false;
		if (data < temp.getData())
			return search(data, temp.getLeft());
		if (data > temp.getData())
			return search(data, temp.getRight());
		return false;
	}

	public int max(Node tempNode) {
		if (tempNode.getRight() == null) {
			return tempNode.getData();
		}
		return max(tempNode.getRight());
	}

	public int min(Node tempNode) {
		if (tempNode.getLeft() == null)
			return tempNode.getData();
		return min(tempNode.getLeft());
	}

	public void preOrderWhile() throws ExceptionHandling {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (!(stack.isEmpty()) || temp != null) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
	}

	public void inOrderWhile() throws ExceptionHandling {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (!(stack.isEmpty())) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
	}


	public boolean deleteTerminal(int data) {
		if (root == null)
			return false;
//		if (root.getData() == data) {
//			root = null;
//			return true;
//		}// this condition of root is followed by the inner loop;
		Node temp = root, prev = root;
		while (true) {
			if (data < temp.getData()) {
				prev = temp;
				temp = temp.getLeft();
			}
			if (data > temp.getData()) {
				prev = temp;
				temp = temp.getRight();
			}
			if (data == temp.getData()) {
				if (temp.getLeft() == null && temp.getRight() == null) {
//this condition for the terminal node;
					if (data < prev.getData()) {
						prev.setLeft(null);
						return true;
					}
					prev.setRight(null);
					return true;
				}
//this condition is for non terminal node;
				return false;
			}
		}
	}

}
