package question;

import java.util.Scanner;
import doublyLinkedList.*;
public class Question15 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			DoublyLinkedList dll=new DoublyLinkedList();
			int option;
			do {
				System.out.println("Enter option 1. Insert node at end,2. Insert node at begin, "
						+ "3. Insert node at middle of list\r\n"
						+ "4. Remove node from end, 5. Remove node from begin,\n "
						+ "6. Remove node from middle of list\r\n, 7. Display list elements");
				option=sc.nextInt();
			switch(option) {
				case 1:
					System.out.println("Enter data ");
					dll.insertEnd(sc.nextInt());
					break;
				case 2:
					System.out.println("Enter data ");
					dll.insertBeginning(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter data and position");
					dll.insertByPosition(sc.nextInt(), sc.nextInt());
					break;
				case 4:
					dll.deleteEnd();
					break;
				case 5:
					dll.deleteBeginning();
					break;
				case 6:
					System.out.println("Enter the position");
//					dll.deleteByPosition(sc.nextInt());
					break;
				case 7:
					
					break;
			}
			}while(option!=10);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
