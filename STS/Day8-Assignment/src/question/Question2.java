package question;

import java.util.Scanner;

import genericStack.Stack;

public class Question2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stack<Character> stack = new Stack<>();
			System.out.println("Enter String");
			String string = sc.next();
			int i = 0;
			while (i < string.length()) {
				stack.push(string.charAt(i));
				i++;
			}
			while (i-- > 0) {
				System.out.println(stack.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
