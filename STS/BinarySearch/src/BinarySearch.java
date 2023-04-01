
public class BinarySearch {

	public static int binarySearch(int[] arr, int searchElement) {
		int lowIndex =0, highIndex=arr.length-1, midIndex=-1;
		while(lowIndex <= highIndex) {
			//
			System.out.println("Current lowIndex" + lowIndex + " highIndex" + highIndex);
			midIndex = (lowIndex + highIndex) /2;
			System.out.println("Current middle element" + arr[midIndex]);
			if(arr[midIndex] == searchElement) {
				// Element found
				System.out.println("Element found");
				return midIndex;
			}
			else {
				if(searchElement < arr[midIndex]) {
					// select only left part
					 highIndex = midIndex -1;
				}
				else {
					// select only right part
					lowIndex = midIndex + 1;
				}
			}
		}
		System.out.println("Element NOT found");
		return -1;
		// OR Throw exception
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,34,45,78,90,97,113, 115,127,237};
		int searchElement = 6;
		binarySearch(arr,searchElement);
		searchElement = 237;
		binarySearch(arr,searchElement);
		searchElement = 114;
		binarySearch(arr,searchElement);
	}

}
