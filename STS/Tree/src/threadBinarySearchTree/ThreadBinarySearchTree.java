package threadBinarySearchTree;

public class ThreadBinarySearchTree {
	private Node root;

	public ThreadBinarySearchTree() {
		this.root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return true;}
		Node temp = root;
		while (true) {
			if (data == temp.getData())
				return false;
			if (data < temp.getData()) {
				if (temp.getLflag() == 'T') {
					newNode.setLeft(temp.getLeft());
					newNode.setRight(temp);
					temp.setLeft(newNode);
					temp.setLflag('L');
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRflag() == 'T') {
					newNode.setRight(temp.getRight());
					newNode.setLeft(temp);
					temp.setRight(newNode);
					temp.setRflag('L');
					return true;
				}
				temp = temp.getRight();
			}
		}

	}

	public void preOrder() {
		Node curr = root;
		char flag = 'L';
		while (curr != null) {
			while (curr.getLflag() == 'L' && flag == 'L') {
				System.out.print(curr.getData()+" ");
				curr = curr.getLeft();
			}
			if (flag == 'L')
				System.out.print(curr.getData()+" ");
			flag = curr.getLflag();
			curr = curr.getRight();
		}
		System.out.println();
	}
	
	public void inOrder() {
		Node curr=root;
		char flag='L';
		while(curr!=null) {
			while(curr.getLflag()=='L' && flag=='L') {
				curr=curr.getLeft();
			}
			System.out.print(curr.getData()+" ");
			flag=curr.getLflag();
			curr=curr.getRight();
		}
		System.out.println();
	}
	
	public void inorder() {
		Node curr=root;
		char flag='L';
		while(curr!=null) {
			while(curr.getLflag()=='L' && flag=='L') {
				curr=curr.getLeft();
			}
			System.out.print(curr.getData()+" ");
			flag=curr.getRflag();
			curr=curr.getRight();
		}
		System.out.println();
	}
	
//	public void preorder() {
//        Node temp = root;
//        char flag = 'L';
//        System.out.print("Preorder: ");
//
//        while(temp != null) {
//
//            while (temp.getLflag() == 'L' && flag == 'L') {
//                System.out.print(temp.getData() + " ");
//                temp = temp.getLeft();
//            }
//            if(flag == 'L') {
//                System.out.print(temp.getData() + " ");
//            }
//            flag = temp.getRflag();
//            temp = temp.getRight();
//
//        }
//        System.out.println();
//
//    }
}
