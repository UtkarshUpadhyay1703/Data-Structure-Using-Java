package doubleEndedStackQ4;

import exception.ExceptionHandling;

public class DoubleEndedStack<T> {
	private int top1;
	private int top2;
	private T[] arr;

	public DoubleEndedStack(int size) {
		arr = (T[]) new Object[size];
		top1 = -1;
		top2 = arr.length;
	}

	public DoubleEndedStack() {
		arr = (T[]) new Object[10];
		top1 = -1;
		top2 = arr.length;
	}

	public boolean isFull() {
		if ((top2 - top1) == 1)
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (top1 == -1 && top2 == arr.length)
			return true;
		return false;
	}

	public void pushBeginning(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Already Full");
		arr[++top1] = data;
	}

	public void pushEnd(T data) throws ExceptionHandling {
		if (isFull())
			throw new ExceptionHandling("Already Full");
		arr[--top2] = data;
	}

	public T peekBeginninng() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		return arr[top1];
	}

	public T peekEnd() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		return arr[top2];
	}

	public T popBeginning() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		return arr[top1--];
	}

	public T popEnd() throws ExceptionHandling {
		if (isEmpty())
			throw new ExceptionHandling("Already Empty");
		return arr[top2++];
	}
}