package genericQueue;

import exception.ExceptionHandling;

public class GenericQueue<T> {
	private int rear;
	private int front;
	private T[] arr;

	public GenericQueue(int size) {
		super();
		this.rear = -1;
		this.front = -1;
		arr = (T[]) new Object[size];
	}

	public GenericQueue() {
		super();
		this.rear = -1;
		this.front = -1;
		arr = (T[]) new Object[5];
	}

	public boolean isEmpty() {
		if (front > rear && rear == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (front == (arr.length - 1))
			return true;
		return false;
	}

	public void enqueue(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Full already");
		if (front == -1)
			front = 0;
		arr[++rear] = data;
	}

	public T dequeue() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Empty already");
		return arr[front++];
	}

	public void display() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Empty already");
		for (int i = front; i <= rear; i++)
			System.out.println(arr[i]);
	}
}
