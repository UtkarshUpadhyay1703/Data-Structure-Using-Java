package all;

import exception.ExceptionHeandling;

public class CircularQueue<T> {
	private int front;
	private int rear;
	private int counter;
	private int size;
	private T queue[];
	public CircularQueue() {
		size=10;
		front=-1;
		rear=-1;
		counter=0;
		queue=(T[]) new Object[size];
	}
	public CircularQueue(int size) {
		this.size=size;
		front=-1;
		rear=-1;
		counter=0;
		queue=(T[]) new Object[size];
	}
	public boolean isFull() {
		if(counter==(queue.length))return true;
		return false;
	}
	public boolean isEmpty() {
		if(counter==0) return true;
		return false;
	}
	public boolean enqueue(T data) throws ExceptionHeandling {
		if(isFull())throw new ExceptionHeandling("Already Full");
		if(front==-1)front=0;
		rear=(rear+1)%size;
		queue[rear]=data;
		counter++;
		return true;
	}
	public T dequeue() throws ExceptionHeandling {
		if(isEmpty()) throw new ExceptionHeandling("Already Empty");
		front=(front+1)%size;
		counter--;
		return queue[front];
	}
	public void display() {
		if(isEmpty()) System.out.println("Already Empty");
		int x=front;
		for(int i=0;i<size;i++) {
			if(queue[x]!=null) {
				System.out.println(queue[x]);
			}
			x=(x+1)%size;
		}
	}
	
}
