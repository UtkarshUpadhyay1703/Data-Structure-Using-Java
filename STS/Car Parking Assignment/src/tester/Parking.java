package tester;

import java.util.Scanner;

import parking.ParkingFunctions;

public class Parking {

	public static void main(String[] args) {
		ParkingFunctions parking = new ParkingFunctions();
		try (Scanner sc = new Scanner(System.in)) {
			int i=0;
			do {
			System.out.println("Enter the input");
			parking.input(sc.next());
			i++;
		}while(i<10);
		}
	}
}
