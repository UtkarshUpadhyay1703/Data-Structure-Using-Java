package circularDLL;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class CircularDLL {
	private Node head;
	public CircularDLL() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean display() {
		if(head==null)return false;
		Node temp=head;
		while(temp.getNext()!=head) {
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		System.out.println(temp.getData());
		return true;
	}
	
	public boolean sortAccending() {
		if(head==null) return false;
		Product[] arr= new Product[100];
		Node temp=head;
		int i=0;
		while(temp.getNext()!=head) {
			arr[i++]=(Product) temp.getData();
			temp=temp.getNext();
		}
		arr[i++]=(Product) temp.getData();
//		arr[i++]=(Product) temp.getData();
//		Arrays.sort(arr, new Comparator<Product>() {
//			@Override
//			public int compare(Product P1,Product P2) {
//				return ((Integer) P1.getId()).compareTo(P2.getId());
//			}
//		});
		
		for(int k=0;k<arr.length;k++) {
			for(int j=0;j<arr.length-(i+2);j++) {
				if(arr[j+1]!=null) {
				if(arr[j].getId()>arr[j+1].getId()) {
					Product tempsort=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tempsort;
				}
				}
			}
		}
		for(Product p:arr) {
			if(p!=null) {
			System.out.println(p);}
		}
		return true;
	}
	
	
	

	public boolean insertByPosition(Product data,int position) {
		Node newNode = new Node(data);
		if(position==1) {
			if(head==null) {
				newNode.setNext(head);
				head=newNode;
				return true;
			}
			newNode.setNext(head);
			head.setPrev(newNode);//import
			head=newNode;
			return true;
		}
		if(head==null)return false;
		if(position==2) {
			if(head.getNext()==null) {
				newNode.setPrev(head);
				newNode.setNext(head);
				head.setNext(newNode);
				return true;
			}
			newNode.setPrev(head);
			newNode.setNext(head.getNext());
			head.getNext().setPrev(newNode);
			head.setNext(newNode);
			return true;
		}
		Node temp=head;
		while(position>2 && temp!=head) {
			temp=temp.getNext();
			position--;
		}
		if(temp!=head)return false;
		if(temp.getNext()==head) {
			newNode.setPrev(temp);
			temp.setNext(newNode);
			newNode.setNext(head);
			return true;
		}
		newNode.setNext(temp.getNext());
		newNode.setPrev(temp);
		temp.getNext().setPrev(newNode);
		temp.setNext(newNode);
		return true;
	}
	
	
	public boolean insertAtEnd(Product data) {
		Node newNode =new Node(data);
		if(head==null) {
			head=newNode;
			newNode.setNext(head);
			newNode.setPrev(head);
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=head) {
			temp=temp.getNext();
		}
		newNode.setNext(head);
		newNode.setPrev(temp);
		temp.setNext(newNode);
		return true;
	}
	
//	public boolean deleteByPosition(int position) {
//		if(head==null)return false;
//		if(position==1) {
//			head=head.getNext();
//			return true;
//		}
//		if(position==2) {
//			head.setNext(head.getNext().getNext());
//			head.getNext().setPrev(head);
//			return true;
//		}
//		Node temp=head;
//		while(position>2 && temp!=head) {
//			temp=temp.getNext();
//		}
//		if(temp==head)return false;
//			temp.setNext(temp.getNext().getNext());
//			temp.getNext().setPrev(temp);
//			return true;
//	}
	
	
//	public boolean deleteByPosition(int position) {
//		if(head==null)return false;
//		if(position==1) {
//			head=head.getNext();
//			return true;
//		}
//	}
	
	
	
	public boolean search(Product data) {//if we wanted to search via product id
		if(head==null)return false;
		Node temp=head;
		while(temp.getNext()!=head) {
			if(temp.getData().equals(data)) {
				return true;
			}
			temp=temp.getNext();
		}
		if(temp.getData().equals(data)) {
			return true;
		}
		return false;
	}
	
	
	
	
	public boolean displayReverse() {
		if(head==null)return false;
		Stack<Product> stack=new Stack<>();
		Node temp=head;
//		stack.push(temp.getData());
		while(temp.getNext()!=head) {
			stack.push((Product)temp.getData());
			temp=temp.getNext();
		}
		stack.push((Product)temp.getData());
		temp=head;
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		return true;
	}
	
	
}
