package genericCircularQueueQuestion10;

import exception.ExceptionHandling;

public class CircularQueue<T> {
	private int rear;
	private int front;
	private T[] arr;
	private int counter;

	public CircularQueue() {
		rear = -1;
		front = -1;
		counter = 0;
		arr = (T[]) new Object[10];
	}

	public CircularQueue(int size) {
		rear = -1;
		front = -1;
		counter = 0;
		arr = (T[]) new Object[size];
	}

	public boolean isFull() {
		if (counter == arr.length)
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (counter == 0)
			return true;
		return false;
	}

	public void enqueue(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Already Full");
		if (front == -1)
			front = 0;
		rear = (rear + 1) % arr.length;
		arr[rear] = data;
		counter++;
	}

	public T dequeue() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		T temp = arr[front];
		front = ((front + 1) % arr.length);
		counter--;
		return temp;
	}
}
