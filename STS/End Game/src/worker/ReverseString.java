package worker;

import java.util.Scanner;

import all.GenericStack;

public class ReverseString {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter any String");
			String str=sc.next();
			GenericStack<Character> stack=new GenericStack<Character>(20);
			int count=0;
			while(count<str.length()) {
				stack.push(str.charAt(count));
				count++;
			}
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
