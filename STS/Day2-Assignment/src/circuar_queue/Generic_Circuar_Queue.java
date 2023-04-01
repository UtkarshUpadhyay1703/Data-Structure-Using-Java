package circuar_queue;

import exception.ExceptionHandling;

public class Generic_Circuar_Queue<T> {
	private int size;
	private T[] arr;
	private int front;
	private int rear;
	private int counter;

	public Generic_Circuar_Queue() {
		this.size = 5;
		arr = (T[]) new Object[size];
		front = -1;
		rear = -1;
		counter = 0;
	}

	public Generic_Circuar_Queue(int size) {
		this.size = size;
		arr = (T[]) new Object[size];
		front = -1;
		rear = -1;
		counter = 0;
	}

	public boolean isEmpty() {
		if (counter == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (counter == arr.length)
			return true;
		else
			return false;
	}

	public void enqueue(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Full");
		else {
			rear = (rear+ 1) % size;
			arr[rear] = data;
			if (front == -1)
				front = 0;
			counter = counter + 1;
		}
	}

	public T dequeue() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Empty");
		else {
			front = (front + 1) % size;
			T temp = arr[front];
			counter = counter - 1;
			return temp;
		}
	}
}
