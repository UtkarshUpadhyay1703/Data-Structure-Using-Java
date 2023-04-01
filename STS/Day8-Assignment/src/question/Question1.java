package question;

import java.util.Scanner;

import genericStack.Stack;

public class Question1 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){ 
			String option;
			Stack<Integer> stack=new Stack<>();
		do {
			System.out.println("Enter option a. Push element\r\n"
					+ "b. Pop element\r\n"
					+ "c. Peep element\r\n"
					+ "d. Check if stack is full\r\n"
					+ "e. Check if stack is empty");
			option=sc.next();
			switch (option) {
			case "a":
				stack.push(sc.nextInt());
				break;
			case "b":
				System.out.println(stack.pop());
				break;
			case "c":
				System.out.println(stack.peek());
				break;
			case "d":
				System.out.println(stack.isFull());
				break;
			case "e":
				System.out.println(stack.isEmpty());
				break;
			}
		}while(option!="f");
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
