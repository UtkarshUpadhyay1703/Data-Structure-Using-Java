package sll;

import exception.ExceptionHandling;
import node.NodeWithGenerics;

public class SLLWithGenerics<T> {
	private NodeWithGenerics<T> head;

	public SLLWithGenerics() {
		this.head = null;
	}

	public void insert(T data) {
		NodeWithGenerics<T> newNode = new NodeWithGenerics<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			NodeWithGenerics<T> lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
	}

	public void insertFromBeg(T data) {
		NodeWithGenerics<T> newNode = new NodeWithGenerics<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public NodeWithGenerics<T> removeFromEnd() throws ExceptionHandling {
		NodeWithGenerics<T> prevNode = head;
		NodeWithGenerics<T> lastNode = head;
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

	public NodeWithGenerics<T> removeFromBeg() throws ExceptionHandling {
		NodeWithGenerics<T> firstNode = head;
		if (head == null) {
			throw new ExceptionHandling("Empty");
		} else {
			firstNode = head;
			head = head.getNext();
			return firstNode;
		}
	}

	public NodeWithGenerics<T> searchByPosition(int position) throws ExceptionHandling {
		NodeWithGenerics<T> searchedNode = head;
		if (position < 1) {
			throw new ExceptionHandling("In positive only");
		}
		while (position > 1) {
			if (searchedNode.getNext() == null) {
				throw new ExceptionHandling("Position is too high");
			}
			searchedNode = searchedNode.getNext();
			position = position - 1;
		}
		return searchedNode;
	}

	public void display() throws ExceptionHandling {
		NodeWithGenerics<T> currentNode = head;
		if (head == null)
			throw new ExceptionHandling("Empty");
		else {
			while (currentNode.getNext() != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
			}
			System.out.println(currentNode.getData());
		}
	}

}
