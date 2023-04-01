package day1_assignment;

import java.util.Scanner;

import day1_assignment_classGenericStack.BusinessLogic;
import exception.ExceptionHandling;

public class Test1<T> {

	public static void main(String[] args) throws ExceptionHandling {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size of array");
			BusinessLogic<Integer> BL1=new BusinessLogic<>(sc.nextInt());
			int option;
			do {
				
				System.out.println("Enter the option 1.Add(push), 2.Remove(pop), "
						+ "3.peek, 4.isfull, 5.isEmpty");
				option=sc.nextInt();
				switch (option) {
				case 1:
					BL1.push(sc.nextInt());
					break;
				case 2:
					System.out.println(BL1.pop());
					break;
				case 3:
					System.out.println(BL1.peek());
					break;
				case 4:
					if(BL1.isFull()) System.out.println("Full");
					else System.out.println("Not Full");
					break;
				case 5:
					if(BL1.isEmpty()) System.out.println("Empty");
					else System.out.println("Not empty");
					break;
				}
			}while(option!=10);
		}

	}

}
