package hashing;

public class Tester {

	public static void main(String[] args) {
		Hash hash=new Hash(10);
		System.out.println(hash.insert(10));
		System.out.println(hash.insert(20));
		System.out.println(hash.insert(11));
		System.out.println(hash.insert(15));
		System.out.println(hash.insert(18));
		System.out.println(hash.insert(28));
		System.out.println(hash.insert(25));
		System.out.println(hash.insert(38));
		System.out.println(hash.insert(35));
		System.out.println(hash.insert(101));
		System.out.println(hash.search(28));
		System.out.println(hash.delete(35));
		System.out.println(hash.delete(35));
		System.out.println(hash.search(35));

	}

}
