//05-10-2026 : Aditya Dighe : Selection Sort

package dailypractice.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,5,2,8,9,4};
		int size = arr.length;
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		
		TestSelectionSort test = new TestSelectionSort();
		test.selectionSort(arr,size);
		
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}
class TestSelectionSort {
	public void selectionSort(int arr[], int size) {
		int temp = 0;
		
		for(int i = 0; i<size-1; i++) {
			
			int minIdx = i;
			
			for(int j = i+1; j<size; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		return;
    }
}