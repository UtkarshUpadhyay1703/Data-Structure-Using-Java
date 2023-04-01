package SSLAssignmentDay25_11_2022;

import exception.ExceptionHandling;

public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

//	public boolean insertMiddle(int data, int position) throws ExceptionHandling {
//		Node newNode = new Node(data);
//		if (position == 1) {
//			if (head == null) {
//				head = newNode;
//				return true;
//			}
//			newNode.setNext(head.getNext());
//			head.setNext(newNode);
//			return true;
//		}
//		if (head == null)
//			throw new ExceptionHandling("Invalid Position");
//		Node prev = head, del = head;
//		while (position > 0) {
//			if (del.getNext() != null) {
//				prev = del;
//				del = del.getNext();
//			} else
//				throw new ExceptionHandling("Invalid Position");
//			position = position - 1;
//		}
//		newNode.setNext(del.getNext());
//		prev.setNext(newNode);
//		return true;
//	}
	public boolean insertByPosition(int data,int position) {
		Node newNode=new Node(data);
		if(position==1) {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		if(head==null)return false;
		if(position==2) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			return true;
		}
		Node curr=head;
		while(position>2) {
			if(curr.getNext()==null) return false;
			curr=curr.getNext();
			position=position-1;
		}
		newNode.setNext(curr.getNext());
		curr.setNext(newNode);
		return true;
	}

//	public boolean insertByValue(int data, int value) throws ExceptionHandling {
//		if (head == null)
//			throw new ExceptionHandling("Empty List");
//		Node newNode = new Node(data);
//		Node curr = head;
//		while (curr.getNext() != null) {
//			if (curr.getData() == value) {
//				newNode.setNext(curr.getNext());
//				curr.setNext(newNode);
//				return true;
//			}
//		}
//		if (curr.getData() == value) {
//			newNode.setNext(curr.getNext());
//			curr.setNext(newNode);
//			return true;
//		}
//		return false;
//	}
	
	public boolean insertAfterValue(int data,int posData) throws ExceptionHandling {
		if(head==null) throw new ExceptionHandling("Empty");
		Node newNode=new Node(data);
		Node curr=head;
		while(curr.getNext()!=null&&curr.getData()!=posData) {
			curr=curr.getNext();
		}
		if(curr.getData()==posData) {
			newNode.setNext(curr.getNext());
			curr.setNext(newNode);
			return true;
		}
			throw new ExceptionHandling("Invalid position");
	}

	public void printMiddle() throws ExceptionHandling {
		if(head==null)throw new ExceptionHandling("Empty");
		Node curr=head;
		int count=1;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
			count=count+1;
		}
		curr=head;
		if(count%2==0) {
			count=count/2;
			while(count>1) {
				curr=curr.getNext();
				count=count-1;
			}
			System.out.println(curr.getData());
			System.out.println(curr.getNext().getData());
		}
		else {
			count=count/2;
			while(count>=1) {
				curr=curr.getNext();
				count=count-1;
			}
			System.out.println(curr.getData());
		}
	}
	public Node deleteMiddle(int position) throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Empty already");
		Node prev = head, del = head;
		if (position == 1) {
			head = head.getNext();
			return del;
		}
		while (position > 0) {
			prev = del;
			del = del.getNext();
			position = position - 1;
		}
		prev.setNext(del.getNext());
		return del;
	}

	public Node deleteByValue(int value) throws ExceptionHandling {
		if (head == null)
			throw new ExceptionHandling("Already empty");
		Node prev = head, del = head;
		while (del.getNext() != null) {
			if (del.getData() == value) {
				prev.setNext(del.getNext());
				return del;
			}
			prev = del;
			del = del.getNext();
		}
		if (del.getData() == value) {
			prev.setNext(del.getNext());
			return del;
		}
		return null;
	}

	public void display() {
		if (head == null)
			System.out.println("Empty");
		else {
			Node curr = head;
			while (curr.getNext() != null) {
				System.out.print(curr.getData() + "  ");
				curr = curr.getNext();
			}
			System.out.println(curr.getData());
		}
	}
}
