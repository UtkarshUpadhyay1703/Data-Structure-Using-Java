package ssl;

import exception.ExceptionHandling;
import node.Node;

public class SSL {
	private Node head;

	public SSL() {
		this.head = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode=lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
	}

	public void insertFromBeg(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head.setNext(newNode);
		}
	}

	public Node removeFromEnd() throws ExceptionHandling {
		Node prevNode = head;
		Node lastNode = head;
		if (head == null) {
			throw new ExceptionHandling("Empty");
		}
		if (head.getNext() == null) {
			lastNode = head.getNext();
			head = null;
			return lastNode;
		}
		while (lastNode.getNext() != null) {
			prevNode = lastNode;
			lastNode = lastNode.getNext();
		}
		prevNode.setNext(null);
		return lastNode;
	}

	public Node removeFromBeg() throws ExceptionHandling {
		Node firstNode = head;
		if (head == null) {
			throw new ExceptionHandling("Empty");
		} else {
			firstNode = head;
			head = head.getNext();
			return firstNode;
		}
	}

	public Node searchByPosition(int position) throws ExceptionHandling {
		Node searchedNode = head;
		if(position<1) {
			throw new ExceptionHandling("In positive only");
		}
		while (position > 1) {
			if(searchedNode.getNext()==null) {
				throw new ExceptionHandling("Position is too high");
			}
			searchedNode = searchedNode.getNext();
			position = position - 1;
		}
		return searchedNode;
	}

	public void display() throws ExceptionHandling {
		Node currentNode = head;
		if (head == null)
			throw new ExceptionHandling("Empty");
		else {
			while(currentNode.getNext()!=null) {
				System.out.println(currentNode.getData());
				currentNode=currentNode.getNext();
			}
			System.out.println(currentNode.getData());
		}
	}

}
