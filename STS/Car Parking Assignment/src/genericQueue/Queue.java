package genericQueue;

public class Queue<T> {
	private int front;
	private int rear;
	private T[] arr;

	public Queue(int size) {
		front = -1;
		rear = -1;
		arr = (T[]) new Object[size];
	}

	public Queue() {
		front = -1;
		rear = -1;
		arr = (T[]) new Object[10];
	}

	public boolean isEmpty() {
		if (front > rear || rear == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (front == (arr.length-1))
			return true;
		return false;
	}

	public boolean enqueue(T data) {
		if (isFull())
			return false;
		arr[++rear] = data;
		if (front == -1)
			front = front + 1;
		return true;

	}

	public T dequeue() {
		if (isEmpty())
			return null;
		return arr[front++];
	}

	public T peek() {
		if (isEmpty())
			return null;
		return arr[front];
	}
}
