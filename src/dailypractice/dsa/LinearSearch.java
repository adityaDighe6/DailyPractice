//28-09-2026 : Binary Search : Time complexity O(log(n))

package dailypractice.dsa;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,7,9,11,13};
		int target = 11;
		
		TestLinearSearch test = new TestLinearSearch();
		int result = test.linearSearch(nums, target);
		
		if(result != -1) {
			System.out.println("The index of the element is : "+result);
		}
		else {
			System.out.println("Element not found...");
		}

	}
}
class TestLinearSearch {
	public int linearSearch(int nums[], int target) {
		int steps = 0;
		
		for(int i = 0; i<nums.length; i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("Steps taken by Linear Search are : "+steps);
				return i;
			}
		}
		System.out.println("Steps taken by Linear Search are : "+steps);
		return -1;
	}
}