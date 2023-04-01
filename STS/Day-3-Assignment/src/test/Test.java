package test;

import exception.ExceptionHandling;
import ssl.SSL;

public class Test {

	public static void main(String[] args) throws ExceptionHandling {
		SSL ssl=new SSL();
		ssl.insert(100);
		ssl.insert(150);
		ssl.insert(200);
		ssl.insert(260);
		ssl.display();
		System.out.println();
		System.out.println(ssl.removeFromBeg().getData());
		System.out.println(ssl.searchByPosition(2).getData());
	}

}
