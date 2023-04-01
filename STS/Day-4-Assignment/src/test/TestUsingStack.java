package test;

import exception.ExceptionHandling;
import sll.SLL;

public class TestUsingStack {

	public static void main(String[] args) throws ExceptionHandling {
		// TODO Auto-generated method stub
		SLL sll=new SLL();
		sll.insertFromBeg(1);
		sll.insertFromBeg(2);
		sll.insertFromBeg(3);
		sll.insertFromBeg(8);
		sll.insertFromBeg(5);
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
		System.out.println(sll.removeFromBeg().getData());
	}

}
