package doublyLinkedList;

import exception.ExceptionHandling;

public class DoublyLinkedList {
	private Node head;

	public DoublyLinkedList() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertBeginning(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	public boolean insertEnd(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		newNode.setPrev(curr);
		curr.setNext(newNode);
		return true;
	}

	public boolean insertByPosition(int data, int position) throws ExceptionHandling {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (position == 1) {
			insertBeginning(data);
		}
		Node curr = head;
		while (position > 0) {
			if (curr != null) {
				curr = curr.getNext();
			} else
				throw new ExceptionHandling("Invalid Position");
			position = position - 1;
		}
		newNode.setPrev(curr.getPrev());
		newNode.setNext(curr);
		curr.getPrev().setNext(newNode);
		curr.setPrev(newNode);
		return true;
	}

	public boolean deleteEnd() throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Already Empty");
		Node del = head;
		while (del.getNext().getNext() != null) {
			del = del.getNext();
		}
		del.setNext(null);
		return true;
	}

	public boolean deleteBeginning() throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Already Empty");
		head = head.getNext();
		return true;
	}

//	public boolean deleteByPosition(int position)throws ExceptionHandling {
//		if (head == null)
//			throw new ExceptionHandling("Already Empty");
//		Node prev = head;
//		while (position < 1) {
//			prev = prev.getNext();
//			position = position - 1;
//		}
//
//	}
//	public boolean display() {
//		if(head==null) System.out.println("Empty");
//		
//		while()
//	}
}
