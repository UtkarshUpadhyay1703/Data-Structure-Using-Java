package test;

import java.util.Scanner;

import exception.ExceptionHandling;
import sll.SLLWithGenerics;

public class Menu {

	public static void main(String[] args) throws ExceptionHandling {
		try(Scanner sc=new Scanner(System.in)){
		SLLWithGenerics<Double> sll=new SLLWithGenerics<>();
		int option;
		do {
			System.out.println("Enter option 1.Insert from beginning, 2.Insert from end, "
					+ "\n3.Remove from end, 4.Remove from beginneing, 5.Display all, "
					+ "\n6.Searching");
			option=sc.nextInt();
			switch(option) {
			case 1:
				sll.insertFromBeg(sc.nextDouble());
				break;
			case 2:
				sll.insert(sc.nextDouble());
				break;
			case 3:
				sll.removeFromEnd();
				break;
			case 4:
				sll.removeFromBeg();
				break;
			case 5:
				sll.display();
				break;
			case 6:
				System.out.println("Enter the position");
				System.out.println(sll.searchByPosition(sc.nextInt()).getData());
				break;
			}
		}while(option!=10);
		}
	}

}
