package dll;

import exception.ExceptionHeandling;

public class DLL {
	private Node head;

	public DLL() {
		head = null;
	}

	public boolean insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	public boolean insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		newNode.setPrev(temp);
		temp.setNext(newNode);
		return true;
	}

	public boolean insertAtPosition(int data, int position) throws ExceptionHeandling {
		Node newNode = new Node(data);
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		if (position == 2) {
			newNode.setPrev(head);
			if (head.getNext() != null) {
				newNode.setNext(head.getNext());
				head.getNext().setPrev(newNode);
			}
			head.setNext(newNode);
		}
		Node temp = head;
		while (position > 2 && temp != null) {
			temp = temp.getNext();
			position--;
		}
		if (temp == null)
			throw new ExceptionHeandling("Invalid Position");
		newNode.setPrev(temp);
		if (temp.getNext() != null) {
			newNode.setNext(temp.getNext());
			temp.getNext().setPrev(newNode);
		}
		temp.setNext(newNode);
		return true;
	}

	public boolean deleteFromBeginning() throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		head = head.getNext();
		return true;
	}

	public boolean deleteAtEnd() throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		return true;
	}

	public boolean deleteAtPosition(int position) throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		if (position == 1) {
			head = head.getNext();
			return true;
		}
		if (position == 2) {
			if (head.getNext() != null) {
				head.getNext().getNext().setPrev(head);
				head.setNext(head.getNext().getNext());
				return true;
			}
			throw new ExceptionHeandling("Invalid position");
		}
		Node temp = head;
		while (position > 2 && temp.getNext() != null) {
			temp = temp.getNext();
			position--;
		}
		if (temp.getNext() == null)
			throw new ExceptionHeandling("Invalid position");
		temp.setNext(temp.getNext().getNext());
		return true;
	}

	public boolean deleteByValue(int data) throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node curr = head, prevcurr = head;
		if (curr.getData() == data) {
			curr.getNext().setPrev(null);
			head = curr.getNext();
			return true;
		}
		while (curr.getData() != data) {
			if(curr.getNext() == null) throw new ExceptionHeandling("Invalid data");
			prevcurr = curr;
			curr = curr.getNext();
		}
		if(curr.getNext()!=null) {
		curr.getNext().setPrev(prevcurr);}
		prevcurr.setNext(curr.getNext());
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.getData() + "    ");
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
}
