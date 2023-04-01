package queue;

import exception.ExceptionHandling;

public class Generics_Queue<T> {
	private int size;
	private T[] arr;
	private int front;
	private int rear;

	public Generics_Queue() {
		this.size = 5;
		arr = (T[]) new Object[size];
		front = -1;
		rear = -1;
	}

	public Generics_Queue(int size) {
		this.size = size;
		arr = (T[]) new Object[size];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		if (front > rear || rear == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (rear == arr.length - 1)
			return true;
		else
			return false;
	}

	public void enqueue(T data) throws ExceptionHandling {
		if(isFull())  throw new ExceptionHandling("Full");
		else 
			rear=rear+1;
			arr[rear]=data;
			if(front==-1) front=0;
	}
	public T dequeue() throws ExceptionHandling {
		if(isEmpty()) throw new ExceptionHandling("Empty");
		else {
			T temp = arr[front];
			front=front+1;
			return temp;
		}
	}
}
