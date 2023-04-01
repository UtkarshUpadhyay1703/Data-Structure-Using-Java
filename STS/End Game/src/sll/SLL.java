package sll;

import exception.ExceptionHeandling;

public class SLL<T> {
	private Node head;
	private T arr[];

	public SLL() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertAtBeginning(T data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	public boolean insertAtEnd(T data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		Node temp = head;
		while (temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(newNode);
		return true;
	}

	public boolean insertAtPosition(T data, int position) {
		Node newNode = new Node(data);
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		if (head == null)
			return false;
		if (position == 2) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			return true;
		}
		Node temp = head;
		while (position > 2 && temp.getData() != null) {
			temp = temp.getNext();
			position--;
		}
		if (temp.getData() == null)
			return false;
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;
	}

	public Node deleteFromBeginning() throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node temp = head;
		head = head.getNext();
		return temp;
	}

	public Node deleteFromEnd() throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node temp = head;
		while (temp.getNext().getNext() != null)
			temp = temp.getNext();
		Node temp1 = temp;
		temp.setNext(null);
		return temp1;
	}

	public Node deleteFromPosition(int position) throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node temp = head;
		Node temp1 = temp;
		if (position == 1) {
			head = head.getNext();
			return temp1;
		}
		if (position == 2 && temp.getNext() != null) {
			temp.setNext(temp.getNext().getNext());
			temp1 = temp.getNext();
			return temp1;
		}
		while (position > 2 && temp.getNext() != null) {
			temp = temp.getNext();
			position--;
		}
		if (temp.getNext() == null)
			throw new ExceptionHeandling("Invalid Position");
		temp1 = temp.getNext();
		temp.setNext(temp1.getNext());
		return temp1;
	}
	
	

	public Node deleteByValue(T data) throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node prev = head;
		Node temp = head;
		while (temp.getData() != null) {
			if (temp.getData() == data) {
				if (head.getData() == data) {
					head = head.getNext();
					return null;
				}
				prev.setNext(temp.getNext());
				return temp;
			}
			prev = temp;
			temp = temp.getNext();
		}
		throw new ExceptionHeandling("Invalid data");
	}

	public void displayMiddleElement() {
		if (head == null)
			System.out.println("Already Empty");
		int total = -1;
		Node temp = head;
		while (temp.getNext() != null) {
			total++;
			temp = temp.getNext();
		}
		temp = head;
		total++;
		int middle;
		int middle1 = -1;
		if (total % 2 == 0) {
			middle = total / 2;
		} else {
			middle = total / 2;
			middle1 = middle + 1;
		}
		while (middle > 0) {
			temp = temp.getNext();
			middle--;
		}
		System.out.print(temp.getData() + "   ");
		if (middle1 != -1)
			System.out.println(temp.getNext().getData());
	}

	public boolean search(T data) throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Alredy Empty");
		Node temp = head;
		while (temp.getNext() != null) {
			if (temp.getData() == data)
				return true;
			temp = temp.getNext();
		}
		if (temp.getData() == data)
			return true;
		return false;

	}

	public boolean isPalandrome() {
		Node first = head;
		Node last = head;
		int length = 0;
		while (first != null) {
			first = first.getNext();
			length++;
		}
		first = head;
		for (int i = 0; i < length / 2; i++) {
			for (int j = 0; j < length - (i + 1); j++) {
				last = last.getNext();
			}
			if (first.getData() != last.getData()) {
				System.out.println("This LL is not palandrome");
				return false;
			}
			first = first.getNext();
			last = head;
		}
		System.out.println("This LL is palandrome");
		return true;
	}

	public boolean sortDescending() {
		if (head == null)
			return false;
		int length = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		temp = head;
		arr = (T[]) new Object[length];
		for (int i = 0; i < length; i++) {
			arr[i] = (T) temp.getData();
			temp = temp.getNext();
		}
		for (int i = 0; i < length - 1; i++) {
			for (int j = length - 2; j >= i; j--) {
				if ((int) arr[j] < (int) arr[j + 1]) {
					T temp1 = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp1;
				}
			}
		}
		temp = head;
		for (int i = 0; i < length; i++) {
			temp.setData(arr[i]);
			temp = temp.getNext();
		}
		return true;
	}

	public boolean deleteAlternateNode() throws ExceptionHeandling {
		if (head == null)
			throw new ExceptionHeandling("Already Empty");
		Node temp = head;
		while (temp.getNext() != null) {
			temp.setNext(temp.getNext().getNext());
			temp = temp.getNext();
		}
		return true;
	}

	public void reverse() {
		if (head == null)
			return;
		Node n1 = head;
		Node n2 = head.getNext();
		Node n3 = head.getNext();
		n1.setNext(null);
		while (n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head = n1;
	}

	public boolean sortingAccending() {
		if (head == null)
			return false;
		int length = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		temp = head;
//	     T[] arr=new T[length];
		arr = (T[]) new Object[length];
		for (int i = 0; i < length; i++) {
			arr[i] = (T) temp.getData();
			temp = temp.getNext();
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - (i + 1); j++) {
				if ((int) arr[j] > (int) arr[j + 1]) {
					T putting = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = putting;
				}
			}
		}
		System.out.println();
		temp = head;
		int i = 0;
		while (i < length) {
			temp.setData(arr[i]);
			temp = temp.getNext();
			i++;
		}
		return true;
	}

	public void display() {
		if (head == null)
			System.out.println("Empty");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "   ");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
