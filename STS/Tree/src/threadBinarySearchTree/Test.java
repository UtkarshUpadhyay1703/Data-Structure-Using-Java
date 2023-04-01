package threadBinarySearchTree;

public class Test {

	public static void main(String[] args) {
		ThreadBinarySearchTree tbst=new ThreadBinarySearchTree();
		System.out.println(tbst.insert(50));
		System.out.println(tbst.insert(30));
		tbst.insert(20);
		tbst.insert(40);
		tbst.insert(25);
		tbst.insert(35);
		tbst.insert(45);
		tbst.insert(70);
		tbst.insert(60);
		tbst.insert(80);
		tbst.preOrder();
		tbst.inOrder();
		tbst.inorder();
	}

}
