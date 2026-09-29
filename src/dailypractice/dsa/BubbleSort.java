//29-09-206 : Bubble Sort : Time complexity O(n2) 

package dailypractice.dsa;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,5,2,8,9,4};
		
		TestBubbleSort test = new TestBubbleSort();
		test.bubbleSort(nums);
	}

}
class TestBubbleSort {
	public void bubbleSort(int nums[]) {
		if(nums == null || nums.length == 0) {
			System.out.println("Empty array...");
		}
		
		int temp;
		int size = nums.length;
		
		System.out.println("Before sorting...");
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println("After sorting");
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}
}