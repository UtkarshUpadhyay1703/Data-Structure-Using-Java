package parking;

import genericQueue.Queue;

public class ParkingFunctions {
	Queue<String> queue = new Queue<>(5);
	String[] parkingSlot = new String[7];

	public boolean carEntering(String carNumber) {
		for (int i = 0; i < parkingSlot.length; i++) {
			if (parkingSlot[i] == "0" || parkingSlot[i] == null) {
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

	public boolean carExiting(String carNumber) {
		for (int i = 0; i < parkingSlot.length; i++) {
			if (parkingSlot[i].equals(carNumber)) {
				if (!queue.isEmpty()) {
					parkingSlot[i] = queue.dequeue();
					return true;
				}
				parkingSlot[i] = "0";
				return true;
			}
		}
		System.out.println("Entered car number does not exists in parking area");
		return false;
	}

}
