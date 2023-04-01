package tree;

import java.util.Stack;

import exception.ExceptionHeandling;

public class TesterBinaryTree {

	public static void main(String[] args) throws ExceptionHeandling {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(30);
		bst.insert(10);
		bst.inOrder();
//		bst.inOrderRecursion(bst.getRoot());
//		bst.preOrder();
//		bst.preOrderRecursion(bst.getRoot());
//		bst.postOrder();
//		bst.postOrderRecursion(bst.getRoot());
//		bst.delete(20);
		bst.inOrder();
		bst.bfs();

	}

}
