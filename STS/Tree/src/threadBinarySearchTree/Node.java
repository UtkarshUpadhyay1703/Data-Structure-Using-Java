package threadBinarySearchTree;

public class Node {
	private int data;
	private Node left;
	private Node right;
	private char rflag;
	private char lflag;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
		rflag = 'T';
		lflag = 'T';
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public char getRflag() {
		return rflag;
	}

	public void setRflag(char rflag) {
		this.rflag = rflag;
	}

	public char getLflag() {
		return lflag;
	}

	public void setLflag(char lflag) {
		this.lflag = lflag;
	}

}
