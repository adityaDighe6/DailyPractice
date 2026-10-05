//05-10-2026 : Aditya Dighe : Selection Sort

package dailypractice.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 25, 12, 22, 11};
		
		System.out.println("Original Array : "+Arrays.toString(arr));
		
		TestSelectionSort test = new TestSelectionSort();
		test.selectionSort(arr);
		
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}

}
class TestSelectionSort {
	public void selectionSort(int arr[]) {
		
		int size = arr.length;

		// One by one move the boundary of the unsorted subarray
		for (int step = 0; step < size - 1; step++) {
        
			int minIdx = step;

			// Find the minimum element in the remaining unsorted array
			for (int i = step + 1; i < size; i++) {
            
				if (arr[i] < arr[minIdx]) {
					minIdx = i;
				}
			}

			// Swap the found minimum element with the first unsorted element
			int temp = arr[step];
			arr[step] = arr[minIdx];
			arr[minIdx] = temp;
		}
    }
}