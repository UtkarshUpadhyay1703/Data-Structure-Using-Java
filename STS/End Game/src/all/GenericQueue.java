package all;

import exception.ExceptionHeandling;

public class GenericQueue<T> {
	private int front;
	private int rear;
	private int size;
	private T queue[];

	public GenericQueue() {
		size = 10;
		front = -1;
		rear = -1;
		queue = (T[]) new Object[size];
	}

	public GenericQueue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		queue = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		if (rear == -1 || front > rear)
			return true;
		return false;
	}

	public boolean isFull() {
		if (rear == (queue.length - 1))
			return true;
		return false;
	}

	public boolean enqueue(T data) throws ExceptionHeandling {
		if (isFull())
			throw new ExceptionHeandling("Already Full");
		if (front == -1)
			front = 0;
		queue[++rear] = data;
		return true;
	}

	public T dequeue() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("Already Empty");
		return queue[front++];
	}
	public T peek() throws ExceptionHeandling {
		if(isEmpty()) throw new ExceptionHeandling("Already Empty");
		return queue[front];
	}
}
