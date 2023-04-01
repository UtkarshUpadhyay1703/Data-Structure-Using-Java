package all;

import exception.ExceptionHeandling;

public class GenericDoublyEndedStack<T> {
	private int top1;
	private int top2;
	private T stack[];
	private int size;

	public GenericDoublyEndedStack() {
		top1 = -1;
		size = 10;
		top2 = size;
		stack = (T[]) new Object[size];
	}

	public GenericDoublyEndedStack(int size) {
		this.size = size;
		top1 = -1;
		top2 = size;
		stack = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		if (top1 == -1 && top2 == size)
			return true;
		return false;
	}

	public boolean isFull() {
		if (top2 - top1 == 1)
			return true;
		return false;
	}

	public boolean pushFront(T data) throws ExceptionHeandling {
		if (isFull())
			throw new ExceptionHeandling("Already Full");
		stack[++top1] = data;
		return true;
	}

	public boolean pushEnd(T data) throws ExceptionHeandling {
		if (isFull())
			throw new ExceptionHeandling("Already Full");
		stack[--top2] = data;
		return true;
	}

	public T popFront() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("Already Empty");
		return stack[top1--];
	}

	public T popEnd() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("Already Empty");
		return stack[top2++];
	}

	public T peekFront() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("Already Empty");
		return stack[top1];
	}

	public T peekEnd() throws ExceptionHeandling {
		if (isEmpty())
			throw new ExceptionHeandling("ALready Empty");
		return stack[top2];
	}
}