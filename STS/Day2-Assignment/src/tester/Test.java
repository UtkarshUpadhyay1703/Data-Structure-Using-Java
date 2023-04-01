package tester;

import circuar_queue.Generic_Circuar_Queue;
import exception.ExceptionHandling;
import myprocess.MyProcess;

public class Test {

	public static void main(String[] args) throws ExceptionHandling {
		Generic_Circuar_Queue<MyProcess> cq = new Generic_Circuar_Queue<MyProcess>(5);
		cq.enqueue(new MyProcess(1, "tan", "kul"));
		cq.enqueue(new MyProcess(2, "vai", "gup"));
		cq.enqueue(new MyProcess(3, "Utk", "Upa"));
		cq.enqueue(new MyProcess(4, "shu", "mis"));
		cq.enqueue(new MyProcess(5, "sah", "kus"));
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		cq.enqueue(new MyProcess(6, "tan", "kul"));
		cq.enqueue(new MyProcess(7, "vai", "gup"));
		cq.enqueue(new MyProcess(8, "Utk", "Upa"));
		cq.enqueue(new MyProcess(9, "shu", "mis"));
		cq.enqueue(new MyProcess(10, "sah", "kus"));
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
	}

}
