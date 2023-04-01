package question;

import java.util.Scanner;

import doubleEndedStackQ4.DoubleEndedStack;

public class Question4 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		DoubleEndedStack<Integer> des=new DoubleEndedStack<>();
		String option;
		do {
			System.out.println("Enter the options a. push Beginning element\r\n"
					+ "b. Push End element\\r\\n"
					+ "c. Pop Beginning element\r\n"
					+ "d. Pop End element\r\n"
					+ "e. Peek Beginning element\r\n"
					+ "f. Peek End element\r\n"
					+ "g. Check if stack is full\r\n"
					+ "h. Check if stack is empty"
					+ "i. Exit");
			option=sc.next();
			switch(option) {
			case "a":
				des.pushBeginning(sc.nextInt());
				break;
			case "b":
				des.pushEnd(sc.nextInt());
				break;
			case "c":
				System.out.println(des.popBeginning());
				break;
			case "d":
				System.out.println(des.popEnd());
				break;
			case "e":
				System.out.println(des.peekBeginninng());
				break;
			case "f":
				System.out.println(des.peekEnd());
				break;
			case "g":
				System.out.println(des.isFull());
				break;
			case "h":
				System.out.println(des.isEmpty());
				break;
			}
		}while(option!="i");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
