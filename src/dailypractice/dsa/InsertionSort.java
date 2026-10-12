//12-OCT-2026 : Aditya Dighe : Insertion Sort.

package dailypractice.dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6};
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		
		TestInsertionSort test = new TestInsertionSort();
		test.insertionSort(arr);
		
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}

class TestInsertionSort {
	public void insertionSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return;
	}
}
