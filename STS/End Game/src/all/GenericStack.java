package all;

import exception.ExceptionHeandling;

public class GenericStack<T> {
	private int top;
	private T stack[];
	private int size;

	public GenericStack() {
		top = -1;
		this.size = 10;
		stack = (T[]) new Object[size];
	}

	public GenericStack(int size) {
		this.size = size;
		this.top = -1;
		stack = (T[]) new Object[size];
	}

	public boolean isFull() {
		if (top == (stack.length - 1))
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public boolean push(T data) throws ExceptionHeandling {
		if (isFull())
			throw new ExceptionHeandling("Stack is already full");
		stack[++top] = data;
		return true;
	}

	public T pop() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("Stack is Empty");
		return stack[top--];
	}

	public T peek() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("Stack is Empty");
		return stack[top];
	}

}