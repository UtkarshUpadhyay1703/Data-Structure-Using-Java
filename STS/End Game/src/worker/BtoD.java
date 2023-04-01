package worker;

import java.util.Scanner;

import all.GenericStack;

public class BtoD {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			GenericStack<Integer> stack = new GenericStack<Integer>(10);
			System.out.println("Enter a number to be converted into decimal");
			int num = sc.nextInt();
			while (num > 0) {
				int temp = num % 2;
				num = num / 2;
				stack.push(temp);
			}
			System.out.println("Decimal value : ");
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
