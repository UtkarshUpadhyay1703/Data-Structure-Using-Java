package question;

import java.util.Scanner;

import singlyLinkedQ13Q14.*;

public class Question13 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SinglyLinkedList list = new SinglyLinkedList();
			int option;
			do {
				System.out.println("Enter option 1. Insert node at end of list," + "2. Insert node begin of list,"
						+ "3. Insert node middle of list\r\n" + "4. Remove node from end of list,"
						+ "5. Remove node from begin of list," + "6. Remove node from middle of list\r\n"
						+ "7. Display list elements" + "8. Exit");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter number");
					list.insertEnd(sc.nextInt());
					break;
				case 2:
					System.out.println("Enter number");
					list.insertBeginnig(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter number and Position");
					list.insertMiddle(sc.nextInt(), sc.nextInt());
					break;
				case 4:
					System.out.println(list.deleteEnd().getData());
					break;
				case 5:
					System.out.println(list.deleteBeginnig().getData());
					break;
				case 6:
					System.out.println("Enter the position");
					System.out.println(list.deleteByPosition(sc.nextInt()).getData());
					break;
				case 7:
					list.display();
					break;
				}
			} while (option != 8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
