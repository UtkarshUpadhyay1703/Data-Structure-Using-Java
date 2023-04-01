package all;

import java.util.Arrays;

public class Sorting {	
	
	public boolean binarySearch(int[] arr,int value) {
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high) {
			mid=(low+(high-low)/2);
		if(arr[mid]>value)high=mid-1;
		if(arr[mid]<value)low=mid+1;
		else return true;
		}
		return false;
	}
	
	
	
	public void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	public void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j=i,minIndex=i;
			while(j<arr.length) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
				j++;
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	
	
	
	public void heapSort(int[] arr,int len) {
		if(len<=1) {
			return;
		}
		for(int i=len-1;i>0;i--) {
			if(arr[i]>arr[(i-1)/2]) {
				int temp=arr[(i-1)/2];
				arr[(i-1)/2]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[0];
		arr[0]=arr[len-1];
		arr[len-1]=temp;
		heapSort(arr, --len);
	}
	
	
	
	public void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
	
	
	
	

	public void quickSort(int[] arr, int left, int right) {
		if(left>right) {
			return;
		}
		else {
			int pivotLocation=partition(arr,left,right);
			System.out.println(Arrays.toString(arr));
			quickSort(arr, left, pivotLocation-1);
			quickSort(arr, pivotLocation+1, right);
		}
	}
	private int partition(int[] arr,int left,int right) {
		int pivotValue=arr[right];
		int i=left-1;
		for(int j=left;j<right;j++) {
			if(pivotValue>arr[j]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=pivotValue;
		arr[right]=temp;
		return i+1;
	}
	
	
	
	public void mergeSort(int[] arr,int beg,int end) {
		if(beg<end) {
			int mid=(end+beg)/2;
			mergeSort(arr, beg, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,beg,mid,end);
		}
		return;
	}
	
	private void merge(int[] arr,int beg,int mid,int end) {
		int i=0,j=0;
		int n1=mid-beg+1;
		int n2=end-mid;
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		while(i<n1) {
			leftarr[i]=arr[beg+i];
			i++;
		}
		while(j<n2) {
			rightarr[j]=arr[mid+1+j];
			j++;
		}
		int k=beg;
		i=j=0;
		while(i<n1 && j<n2) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k++]=leftarr[i++];
			}else {
				arr[k++]=rightarr[j++];
			}
		}
		while(i<n1) {
			arr[k++]=leftarr[i++];
		}
		while(j<n2) {
			arr[k++]=rightarr[j++];
		}
	}
	
	
//	public int[] bubbleSort(int arr[]) {
//		int size=arr.length-1;
//		for(int i=0;i<(size);i++) {
//			for(int j=0;j<(size-i);j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr;
//	}

//	public int[] insertion(int arr[]) {
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]>arr[i+1]) {
//				int temp=arr[i+1];
//				arr[i+1]=arr[i];
//				arr[i]=temp;
//				int j=0;
//				while(j<=i) {
//					if(arr[j]>arr[i]) {
//						int temp1=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp1;
//					}
//					j++;
//				}
//			}
//		}
//		return arr;
//	}

//	public int[] selectionSort(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			int minIndex=i;
//			for(int j=i;j<arr.length;j++) {
//				if(arr[j]<arr[minIndex])
//				minIndex=j;
//			}
//			int temp=arr[i];
//			arr[i]=arr[minIndex];
//			arr[minIndex]=temp;
//		}
//		return arr;
//	}

}
