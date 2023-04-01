package circularQueueUsingLL;

public class CQULLTester {

	public static void main(String[] args) {
		CircularQueueUsingLL queue=new CircularQueueUsingLL();
		queue.enqueue(10);
		System.out.println(queue.peek().getData());
		queue.enqueue(50);
		System.out.println(queue.peek().getData());
		queue.enqueue(80);
		System.out.println(queue.dequeue());
		System.out.println(queue.peek().getNext().getNext().getData());
		queue.enqueue(60);
		queue.enqueue(20);
		queue.enqueue(20);

	}

}
