package tree;

import all.GenericQueue;
import all.GenericStack;
import exception.ExceptionHeandling;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

//	public boolean insert(int data) throws ExceptionHeandling {
//		Node newNode = new Node(data);
//		if (root == null) {
//			root = newNode;
//			return true;
//		}
//		Node temp = root;
//		while (true) {
//			if (temp.getData() == data)
//				throw new ExceptionHeandling("Invalid data");
//			if (temp.getData() > data) {
//				if (temp.getLeft() == null) {
//					temp.setLeft(newNode);
//					return true;
//				}
//				temp = temp.getLeft();
//			} else {
//				if (temp.getRight() == null) {
//					temp.setRight(newNode);
//					return true;
//				}
//				temp = temp.getRight();
//			}
//		}
//	}

//	public void inorder() throws ExceptionHeandling {
//		if (root == null)
//			System.out.println("Empty");
//		GenericStack<Node> stack = new GenericStack<>(10);
//		Node temp=root;
//		char flag='L';
//		while(!stack.isEmpty()) {
//		while(temp.getLeft()!=null && flag=='L') {
//			stack.push(temp);
//			flag='L';
//			temp=temp.getLeft();
//		}
//		System.out.println(temp.getData());
//		if(temp.getRight()!=null) {
//			temp=temp.getRight();
//			flag='L';
//		}
//		else {
//			temp=stack.pop();
//			flag='R';
//		}
//		}
//	}
//	public void inOrderWhile() throws ExceptionHeandling {
//		GenericStack<Node> stack = new GenericStack<>();
//		Node temp = root;
//		while (!(stack.isEmpty()) || temp!=null) {
//			while (temp != null) {
//				stack.push(temp);
//				temp = temp.getLeft();
//			}
//			temp = stack.pop();
//			System.out.print(temp.getData() + " ");
//			temp = temp.getRight();
//		}
//	}

	public boolean insert(int data) throws ExceptionHeandling {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (temp.getData() == data)
				throw new ExceptionHeandling("Invalid data");
			if (temp.getData() > data) {
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

	public void inOrder() throws ExceptionHeandling {
		if (root == null) {
			System.out.println("Already Empty");
			return;
		}
		GenericStack<Node> stack = new GenericStack<>(10);
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData() + "   ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void inOrderRecursion(Node root) {
		if (root == null)
			return;
		inOrderRecursion(root.getLeft());
		System.out.print(root.getData() + "       ");
		inOrderRecursion(root.getRight());
	}

	public void preOrder() throws ExceptionHeandling {
		System.out.println();
		if (root == null)
			System.out.println("Already Empty");
		Node temp = root;
		GenericStack<Node> stack = new GenericStack<>();
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.getData() + "   ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			temp = temp.getRight();
		}
	}

	public void preOrderRecursion(Node root) {
		if (root == null)
			return;
		System.out.print(root.getData());
		preOrderRecursion(root.getLeft());
		preOrderRecursion(root.getRight());
	}

	public void postOrder() throws ExceptionHeandling {
		System.out.println();
		class Pair {
			private Node node;
			private char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}
		GenericStack<Pair> stack = new GenericStack<>();
		Node temp = root;
		while (!stack.isEmpty() || temp != null) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}
			Pair pair = stack.pop();
			temp = pair.node;
			if (pair.flag == 'R') {
				System.out.print(temp.getData() + "      ");
				temp = null;
			} else {
				stack.push(new Pair(temp, 'R'));
				temp = temp.getRight();
			}
		}
		System.out.println();
	}

	public void postOrderRecursion(Node root) {
		if (root == null)
			return;
		postOrderRecursion(root.getLeft());
		postOrderRecursion(root.getRight());
		System.out.print(root.getData() + "   ");
	}

	public boolean delete(int data) throws ExceptionHeandling {
		if (root == null)
			throw new ExceptionHeandling("Already Empty");
//		if (root.getData() == data) {
//			root = null;
//			return true;
//		} WRONG!!!!!!!!!!!!!
		Node del = root;
		Node par = root;
		while (true) {
			if (del.getData() > data) {
				par = del;
				del = del.getLeft();
			} else if (del.getData() < data) {
				par = del;
				del = del.getRight();
			} else if (del.getData() == data && del.getLeft() == null && del.getRight() == null) {
				if (par.getLeft().getData() == data) {
					par.setLeft(null);
					return true;
				} else {
					par.setRight(null);
					return true;
				}
			} else {
//			System.out.println("AAbhi time h");
				if (del.getLeft() != null) {
					Node max = del;
					par = del;
					max = del.getLeft();
					while (max.getRight() != null) {
						par = max;
						max = max.getRight();
					}
					int temp1 = del.getData();
					del.setData(max.getData());
					max.setData(temp1);
					del = max;
				} else {
					Node min = del;
					par = del;
					min = del.getRight();
					while (min.getLeft() != null) {
						par = min;
						min = min.getLeft();
					}
					int temp1 = del.getData();
					del.setData(min.getData());
					min.setData(temp1);
					del = min;
				}
			}
		}
	}

	public void bfs() throws ExceptionHeandling {
		if (root == null)
			System.out.println("Already Empty");
		GenericQueue<Node> queue = new GenericQueue<>(10);
		Node temp = root;
		queue.enqueue(temp);
		while (!queue.isEmpty()) {
			temp = queue.dequeue();
			System.out.println(temp.getData());
			if (temp.getLeft() != null) {
				queue.enqueue(temp.getLeft());
			}
			if (temp.getRight() != null) {
				queue.enqueue(temp.getRight());
			}
		}
	}
}
