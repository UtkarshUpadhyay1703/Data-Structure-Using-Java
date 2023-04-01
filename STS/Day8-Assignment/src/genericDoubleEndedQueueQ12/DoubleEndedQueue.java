package genericDoubleEndedQueueQ12;

import exception.ExceptionHandling;

public class DoubleEndedQueue<T> {
	private int front;
	private int rear;
	private T[] arr;

	public DoubleEndedQueue() {
		arr = (T[]) new Object[10];
		front = -1;
		rear = -1;
	}

	public DoubleEndedQueue(int size) {
		arr = (T[]) new Object[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (rear == (arr.length - 1))
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (front > rear || rear == -1)
			return true;
		return false;
	}

	public boolean enqueueEnd(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Already Full");
		arr[++rear] = data;
		if (front == -1)
			front=front+1;
		return true;
	}

	public boolean enqueueFront(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Already Full");
		int rear1 = rear++;
		while (rear1 == (front - 1)) {
			arr[rear1 + 1] = arr[rear1];
			rear1--;
		}
		arr[rear] = data;
		return true;
	}
	

	public T dequeueFront() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		return arr[front++];
	}

	public T dequeueEnd() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		return arr[rear--];

	}

}
