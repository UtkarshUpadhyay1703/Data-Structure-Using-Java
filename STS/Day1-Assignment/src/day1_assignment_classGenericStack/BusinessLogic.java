package day1_assignment_classGenericStack;

import exception.ExceptionHandling;

public class BusinessLogic <T>{ 
	private int top;
	private int size;
	private T[] arr;
	public BusinessLogic(){
		this.top=-1;
		this.size=10;
		arr= (T[]) new Object[size];
	}
	public BusinessLogic(int size) {
		this.size=size;
		this.top=-1;
		arr=(T[]) new Object[size];
	}
	public boolean isFull() {
		if(top==(size-1)) 
			return true; 
		else return false;
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else 
			return false;
	}
	public boolean push(T data) {
		if(isFull())
			return false;
		else {
			top=top+1;
			arr[top]=data;
			return true;
		}
	}
	public T peek() throws ExceptionHandling {
		if(isEmpty()) throw new ExceptionHandling("Array is empty");
		else {
			return arr[top];
		}
	}
	public T pop() throws ExceptionHandling {
		if(isEmpty()) throw new ExceptionHandling("Array is empty");
		else {
			return arr[top];
		}
}
}