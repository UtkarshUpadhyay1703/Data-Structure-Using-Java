package binaryTree;

import exception.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.insert(100);
		bt.insert(50);
		bt.insert(40);
		bt.insert(80);
		bt.insert(60);
		bt.insert(55);
		bt.insert(70);
		bt.insert(65);
		bt.insert(75);
		bt.insert(90);
		bt.insert(85);
		bt.insert(95);
		bt.insert(120);
		bt.insert(110);
		bt.insert(130);
//		try {
//			bt.postOrder();
//		} catch (ExceptionHandling e) {
//			e.printStackTrace();
//		}
		bt.inOrder(bt.getRoot());
		try {
			bt.inOrderWhile();
		} catch (ExceptionHandling e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
