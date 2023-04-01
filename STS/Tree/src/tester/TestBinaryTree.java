package tester;

import binaryTree.BinaryTree;
import exception.ExceptionHandling;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.insert(50);
		bt.insert(30);
		bt.insert(10);
		bt.insert(40);
		bt.insert(60);
		bt.insert(80);
		bt.insert(70);
		bt.preOrder(bt.getRoot());
		System.out.println();
		bt.inOrder(bt.getRoot());
		System.out.println();
		bt.postOrder(bt.getRoot());
		System.out.println();
		System.out.println(bt.search(80, bt.getRoot()));
		System.out.println();
		System.out.println(bt.max(bt.getRoot()));
		System.out.println(bt.min(bt.getRoot()));
		System.out.println("------------------------------");
		System.out.println();
		try {
			bt.preOrderWhile();
			System.out.println("-------------------------------------------------");
			bt.inOrderWhile();
		} catch (ExceptionHandling e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bt.deleteTerminal(70));
		bt.inOrder(bt.getRoot());
	}

}
