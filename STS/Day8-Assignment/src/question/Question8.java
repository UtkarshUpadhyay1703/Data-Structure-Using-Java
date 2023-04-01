package question;

import java.util.Scanner;

import genericQueueQ8.*;

public class Question8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			genericQueueQ8.GenericQueue<Integer> queue = new genericQueueQ8.GenericQueue<>();
			String option;
			do {
				System.out.println("Enter the option a. Insert element in queue\r\n"
						+ "b. Remove element from queue.\r\n" + "c. Print elements of queue.\r\n"
						+ "d. Check if queue is full\r\n" + "e. Check if queue is empty" + "f. Exit");
				option = sc.next();
				switch (option) {
				case "a":
					queue.enqueue(sc.nextInt());
					break;

				case "b":
					System.out.println(queue.dequeue());
					break;
				case "c":
					queue.display();
					break;
				case "d":
					System.out.println(queue.isFull());
					break;
				case "e":
					System.out.println(queue.isEmpty());
					break;
				}

			} while (option != "f");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
