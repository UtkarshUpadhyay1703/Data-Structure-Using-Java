package infixToPostfix;

import exception.ExceptionHandling;
import genericStack.Stack;

public class InfixToPostfix {

	public int precedence(char e) {
		if (e == '+' || e == '-')
			return 1;
		else
			return 2;
	}

	public String ip(String str1) throws ExceptionHandling {
		Stack<Character> stack = new Stack<>();
		char[] ch = str1.toCharArray();
		String str="";
		int i = 0;
		while (i < str1.length()) {
			ch[i] = str1.charAt(i);
			i++;
		}
		i = 0;
		while (i < ch.length) {
			if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
				if (stack.isEmpty()) {
					stack.push(ch[i]);
				} else {
					char c = stack.pop();
					if (precedence(c) < precedence(ch[i])) {
						stack.push(c);
						stack.push(ch[i]);
					} else {
						while (!stack.isEmpty()) {
							str = str + c;
							if (!stack.isEmpty())
								c = stack.pop();
						}
						str = str + c;
						if (stack.isEmpty())
							stack.push(ch[i]);
					}
				}
			} else {
				str = str + ch[i];
			}
			i++;
		}
		while (!stack.isEmpty()) {
			str = str + stack.pop();
		}
		return str;
	}

	public static void main(String[] args) {
		InfixToPostfix itp = new InfixToPostfix();
		try {
			System.out.println("Postflix = "+itp.ip("m-n*p+q"));
		} catch (ExceptionHandling e) {
			e.printStackTrace();
		}
	}

}
