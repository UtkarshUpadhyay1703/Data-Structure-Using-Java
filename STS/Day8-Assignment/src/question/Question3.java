package question;

import java.util.Scanner;

import genericStack.Stack;

public class Question3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stack<Integer> stack = new Stack<>();
			System.out.println("Enter any decimal");
			int number = sc.nextInt();
			while (number > 0) {
				int x = number % 2;
				number = number / 2;
				stack.push(x);
			}
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
