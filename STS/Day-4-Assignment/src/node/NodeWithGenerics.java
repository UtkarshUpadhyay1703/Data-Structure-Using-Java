package node;

public class NodeWithGenerics<T> {
	private T data;
	private NodeWithGenerics<T> next;
	
	public NodeWithGenerics() {
		this.data=null;
		this.next=null;
	}
	public NodeWithGenerics(T data) {
		this.data = data;
		next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeWithGenerics<T> getNext() {
		return next;
	}

	public void setNext(NodeWithGenerics<T> next) {
		this.next = next;
	}

}
