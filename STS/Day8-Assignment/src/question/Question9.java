package question;

import java.util.Scanner;

import genericQueueQ8.*;
import genericStack.Stack;

public class Question9 {

	public static void main(String[] args) {
		genericQueueQ8.GenericQueue<Character> queue =new genericQueueQ8.GenericQueue<Character>();
		Stack<Character> stack=new Stack<>();
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter string");
			String str=sc.next();
			int i=0;
			while(i<str.length()) {
				stack.push(str.charAt(i));
				i++;
			}
			while(i>0) {
				queue.enqueue(stack.pop());
				i--;
			}
			while(i<str.length()) {
				System.out.println(queue.dequeue());
				i++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
