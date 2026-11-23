//28-09-2026 : Binary Search : Time complexity O(log(n))

package dailypractice.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,7,9,11,13};
		int target = 11;
		
		TestBinarySearch test = new TestBinarySearch();
		int result = test.binarySearch(nums, target);
		
		System.out.println("The index of the element is : "+result);
	}
}
class TestBinarySearch {
	public int binarySearch(int nums[], int target) {
		
		int steps = 0;
		int left = 0;
		int right = nums.length-1;
		
		while(left <= right) {
			steps++;
			int mid = (left + right)/2;
			
			if(nums[mid] == target) {
				System.out.println("No of steps taken : "+steps);
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		System.out.println("No of steps taken : "+steps);
		return -1;
	}
}