package question;

import java.util.Scanner;

import genericDoubleEndedQueueQ12.*;

public class Question12 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			DoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
			String option;
			do {
				System.out.println("Enter the option a. Insert from front end\r\n" + "b. Insert from rear end\r\n"
						+ "c. Remove from front end\r\n" + "d. Remove from rear end\r\n"
						+ "e. Check if queue is full\r\n" + "f. Check if queue is empty g. Exit");
				option = sc.next();
				switch (option) {
				case "a":
					queue.enqueueFront(sc.nextInt());
					break;
				case "b":
					queue.enqueueEnd(sc.nextInt());
					break;
				case "c":
					System.out.println(queue.dequeueFront());
					break;
				case "d":
					System.out.println(queue.dequeueEnd());
					break;
				case "e":
					System.out.println(queue.isFull());
					break;
				case "":
					System.out.println(queue.isEmpty());
					break;
				}

			} while (option != "g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
