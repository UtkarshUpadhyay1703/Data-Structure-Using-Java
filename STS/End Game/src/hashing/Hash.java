package hashing;

public class Hash {
	private Node[] arr;
	private int size;

	public Hash(int size) {
		this.size = size;
		arr = new Node[size];
	}

	public int hashIndex(int data) {
		int index = data % size;
		return index;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		int index = hashIndex(data);
		if (arr[index] == null) {
			arr[index] = newNode;
			return true;
		}
		Node temp = arr[index];
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
	public boolean search(int data) {
		int index=hashIndex(data);
		Node temp=arr[index];
		if(temp==null)return false;
		while(temp.getNext()!=null && temp.getData()!=data) {
			temp=temp.getNext();
		}
		if(temp.getNext()==null) {
			return false;
		}
		return true;
	}

	public boolean delete(int data) {
		int index = hashIndex(data);
		if (arr[index] == null) {
			return false;
		}
		Node temp = arr[index];
		if (temp.getData() == data)
			temp = null;
		while (temp.getNext() != null && temp.getNext().getData() != data) {
			temp = temp.getNext();
		}
		if (temp.getNext() == null)
			return false;
		temp.setNext(temp.getNext().getNext());
		return true;
	}
}
