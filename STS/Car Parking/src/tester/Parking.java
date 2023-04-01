package tester;

import java.util.Scanner;

import parking.ParkingFunctions;

public class Parking {

	public static void main(String[] args) {
		ParkingFunctions parking = new ParkingFunctions();
		try (Scanner sc = new Scanner(System.in)) {
			int option;
			do {
				System.out.println("Enter the option 1. Entering a car, 2. Exiting a car, 3.Exit");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter your car number");
					parking.carEntering(sc.next());
					break;
				case 2:
					System.out.println("Enter your car number");
					parking.carExiting(sc.next());
					break;
				}
			} while (option != 3);
		}
	}
}
