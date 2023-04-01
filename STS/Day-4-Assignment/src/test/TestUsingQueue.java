package test;

import exception.ExceptionHandling;
import sll.SLL;

public class TestUsingQueue {

	public static void main(String[] args) throws ExceptionHandling {
		SLL sll=new SLL();
		sll.insert(5);
		sll.insert(3);
		sll.insert(8);
		sll.insert(1);
		sll.insert(2);
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
	}

}
