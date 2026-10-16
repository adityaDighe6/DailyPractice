//16-10-2026 : Aditya Dighe : Simplified Selection Sort

package dailypractice.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,8,3,1,2};

		TestSelectionSort test = new TestSelectionSort();
		test.selectionSort(arr);
	}

}
class TestSelectionSort {
	public void selectionSort(int arr[]) {

		for(int i=0; i<arr.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			//Swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
		return;
	}
}