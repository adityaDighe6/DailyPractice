//11-09-2026 : Find if an array is sorted or not

package dailypractice;

public class FindArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 3, 5};
		
		TestFindArrayIsSortedOrNot test = new TestFindArrayIsSortedOrNot();
		boolean result = test.findArrayIsSortedOrNot(arr);
		
		System.out.println("Result is : "+result);
	}
}
class TestFindArrayIsSortedOrNot {
	public boolean findArrayIsSortedOrNot(int arr[]) {
		
		if(arr == null || arr.length <=1) {
			return true;
		}
		
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}
}
