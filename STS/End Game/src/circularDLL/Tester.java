package circularDLL;

public class Tester {

	public static void main(String[] args) {
		CircularDLL cdll=new CircularDLL();
		cdll.insertAtEnd(new Product(2, "Sahas", 10, 500));
		cdll.insertAtEnd(new Product(1, "Sahas", 10, 500));
//		cdll.toString();
		cdll.displayReverse();
		System.out.println();
//		System.out.println(cdll.search(new Product(1, "sdfg", 0, 0)));
		System.out.println(cdll.insertByPosition(new Product(3, "dfgh", 5, 85), 1));
		cdll.display();
//		cdll.deleteByPosition(1);
//		cdll.display();
//		System.out.println();
//		cdll.sortAccending();
		
	}

}
