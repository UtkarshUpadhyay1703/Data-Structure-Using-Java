package singlyLinkedQ13Q14;

import exception.ExceptionHandling;

public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertEnd(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
			return true;
		}
	}

	public boolean insertBeginnig(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		} else {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
	}

	public boolean insertMiddle(int data, int position) throws ExceptionHandling {
		Node newNode = new Node(data);
		if (position == 1) {
			if (head == null) {
				head = newNode;
				return true;
			}
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		if (head == null)
			throw new ExceptionHandling("Invalid Position");
		Node prev = head, del = head;
		while (position > 1) {
			if (del != null) {
				prev = del;
				del = del.getNext();
			} else
				throw new ExceptionHandling("Invalid Position");
			position = position - 1;
		}
		newNode.setNext(del);
		prev.setNext(newNode);
		return true;
	}

	public Node deleteEnd() throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Empty already");
		Node prev = head, del = head;
		while (del.getNext() != null) {
			prev = del;
			del = del.getNext();
		}
		prev.setNext(null);
		return del;
	}

	public Node deleteBeginnig() throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Empty already");
		Node del = head;
		del = del.getNext();
		head = del.getNext();
		return del;
	}

	public Node deleteByPosition(int position) throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Empty already");
		Node prev = head, del = head;
		if (position == 1) {
			head = head.getNext();
			return del;
		}
		while (position > 1) {
			prev = del;
			del = del.getNext();
			position = position - 1;
		}
		prev.setNext(del.getNext());
		return del;
	}

	public void display() {
		if (head == null)
			System.out.println("Empty");
		else {
			Node curr = head;
			while (curr.getNext() != null) {
				System.out.print(curr.getData() + "  ");
				curr = curr.getNext();
			}
			System.out.println(curr.getData());
		}
	}

	public void printReverse(Node printable) {
		if (printable == null)
			return;
		printReverse(printable.getNext());
		System.out.print(printable.getData());
	}
}
