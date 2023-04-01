package question;

import java.util.Scanner;

import genericCircularQueueQuestion10.CircularQueue;

public class Question10 {

	public static void main(String[] args) {
		CircularQueue<Integer> cqueue =new CircularQueue<Integer>();
		try(Scanner sc=new Scanner(System.in)){
			String option;
			do {
			System.out.println("a. Insert element in cqueue\r\n"
					+ "b. Remove element from cqueue.\r\n"
					+ "c. Print elements of cqueue.\r\n"
					+ "d. Check if cqueue is full\r\n"
					+ "e. Check if cqueue is empty.");
			option=sc.next();
			switch(option) {
			case "a":
				cqueue.enqueue(sc.nextInt());
				break;
			}
		}while(option!="f");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
