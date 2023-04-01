package parking;

import genericQueue.Queue;

public class ParkingFunctions {
	Queue<Integer> queue = new Queue<>(5);
	int[] parkingSlot = new int[7];
	int carNumber;

	public boolean input(String in) {
		char find = in.charAt(0);
		System.out.println(find);

		String str = in.substring(1);
		carNumber = Integer.parseInt(str);

		if (find == 'i') {
			for (int i = 0; i < parkingSlot.length; i++) {
				if (parkingSlot[i] == 0) {
					parkingSlot[i] = carNumber;
					return true;
				}
			}
			if (queue.isFull()) {
				System.out.println("Parking Full");
				return false;
			}
			queue.enqueue(carNumber);
			return true;
		}
		if (find == 'o') {
			for (int i = 0; i < parkingSlot.length; i++) {
				if (parkingSlot[i] == carNumber) {
					if (!queue.isEmpty()) {
						parkingSlot[i] = queue.dequeue();
						return true;
					}
					parkingSlot[i] = 0;
					return true;
				}
			}
			System.out.println("Entered car number does not exists in parking area");
			return false;
		}
		System.out.println("Invalid input");
		return false;
	}

}
