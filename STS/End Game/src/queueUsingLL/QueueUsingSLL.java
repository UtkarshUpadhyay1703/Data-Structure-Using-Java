package queueUsingLL;

import exception.ExceptionHeandling;

public class QueueUsingSLL<T> {
	private Node front;
	private Node rear;

	public QueueUsingSLL() {
		front = null;
		rear = null;
	}

	public boolean enqueue(T data) {
		Node newNode = new Node(data);
		if (rear == null) {
			front = rear = newNode;
			return true;
		}
		rear.setNext(newNode);
		rear = newNode;
		return true;
	}

	public Node dequeue() throws ExceptionHeandling {
		if (rear == null)
			throw new ExceptionHeandling("Already Empty");
		Node temp = front;
		front = front.getNext();
		return temp;
	}

	public Node peek() throws ExceptionHeandling {
		if (rear == null)
			throw new ExceptionHeandling("Already Empty");
		return front;
	}
}
