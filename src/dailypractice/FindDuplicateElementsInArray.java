//09-09-2026 : Find duplicate elements in array.

package dailypractice;

import java.util.Arrays;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 2, 8, 2, 9, 5, 1};
		
		TestFindDuplicateElementsInArray test = new TestFindDuplicateElementsInArray();
		test.findDuplicateElementsInArray(arr);
		
	}
}
class TestFindDuplicateElementsInArray {
	public void findDuplicateElementsInArray(int arr[]) {
		
		if(arr == null || arr.length == 0) {
			System.out.println("Empty array");
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
		return;
	}
}