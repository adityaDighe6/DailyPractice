//13-OCT-2026 : Aditya Dighe : Quick Sort

package dailypractice.dsa;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 7, 8, 9, 1, 5};
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		
		TestQuickSort test = new TestQuickSort();
		test.quickSort(arr, 0, arr.length-1);
		
		System.out.println("After sorting : "+Arrays.toString(arr));
	}
}
class TestQuickSort {
	public void quickSort(int arr[], int low, int high) {
		
		if(low < high) {
			int pi = partition(arr,low,high);
			
			quickSort(arr,low,pi-1);//for left sub array
			quickSort(arr,pi+1,high);//for right sub array
		}
	}
	
	public int partition(int arr[], int low, int high) {
		return 0;
	}
}