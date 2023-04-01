package circularQueueUsingLL;

public class CircularQueueUsingLL {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean enqueue(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			newNode.setNext(head);
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=head) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	
	
	public boolean dequeue() {
		if(head==null)return false;
		head=head.getNext();
		return true;
	}
	
	
	public Node peek() {
		if(head==null) {
			System.out.println("Already Empty");
			return null;
		}
		return head;
	}
	

}
