package paranthisis;

import java.util.Stack;

public class Paranthisis {

	public static boolean isOpening(char ch) {
		return ch == '(' || ch == '{' || ch == '[';
	}

	public static boolean isMatching(Stack<Character> stack, char ch) {
		char start = stack.pop();
//		System.out.println(start);
		return start == '(' && ch == ')' || start == '{' && ch == '}' || start == '[' || ch == ']';
	}

	public static boolean paranthsisChecker(String string) {
		Stack<Character> stack = new Stack<>();
		int i = 0;
		while (i < string.length()) {
			if (isOpening(string.charAt(i))) {
				stack.push(string.charAt(i));
//				System.out.println((string.charAt(i)));
				
			} else if (isMatching(stack, string.charAt(i))) {
			} else
				return false;
			i++;
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str="({}[()])";
		System.out.println(paranthsisChecker(str));
	}
}
