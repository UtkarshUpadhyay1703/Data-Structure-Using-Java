package question;

import singlyLinkedQ13Q14.*;

public class Question14 {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertBeginnig(1);
		sll.insertBeginnig(2);
		sll.insertBeginnig(3);
		sll.insertBeginnig(4);
		sll.insertBeginnig(5);
		sll.display();
		sll.printReverse(sll.getHead());
	}

}
