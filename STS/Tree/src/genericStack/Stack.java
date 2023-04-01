package genericStack;

import exception.ExceptionHandling;

public class Stack<T> {
	private int top;
	private T[] arr;

	public Stack(int size) {
		this.top = -1;
		arr = (T[]) new Object[size];
	}

	public Stack() {
		this.top = -1;
		arr = (T[]) new Object[10];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (top == (arr.length - 1))
			return true;
		return false;
	}

	public void push(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Full already");
		arr[++top] = data;
	}

	public T pop() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Empty alredy");
		return arr[top--];
	}

	public T peek() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Empty alredy");
		return arr[top];
	}
}
