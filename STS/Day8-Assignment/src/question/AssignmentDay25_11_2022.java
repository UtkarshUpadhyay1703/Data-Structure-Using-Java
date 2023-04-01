package question;

import java.util.Scanner;

import SSLAssignmentDay25_11_2022.*;

public class AssignmentDay25_11_2022 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SinglyLinkedList list = new SinglyLinkedList();
			int option;
			do {
				System.out.println("Enter option 1. Insert node middle of list\r\n"
						+ "2. Insert by value 3.Delete from middle" + "4. Delete from value " 
						+ "5. Display, 6. Display middle element 12. Exit");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter number and Position");
//					list.insertMiddle(sc.nextInt(), sc.nextInt());
					list.insertByPosition(sc.nextInt(), sc.nextInt());
					break;
				case 2:
					System.out.println("Enter number and the data after whiche we have to insert");
//					list.insertByValue(sc.nextInt(), sc.nextInt());
					list.insertAfterValue(sc.nextInt(), sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Position");
					System.out.println(list.deleteMiddle(sc.nextInt()).getData());
					break;
				case 4:
					System.out.println("Enter Value after which we have to delete");
					System.out.println(list.deleteByValue(sc.nextInt()).getData());
					break;
				case 5:
					list.display();
					break;
				case 6:
					list.printMiddle();
					break;

				}
			} while (option != 12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
