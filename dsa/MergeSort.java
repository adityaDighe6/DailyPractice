package dailypractice.dsa;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,5,9,1,6,7};
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		TestMergeSort test = new TestMergeSort();
		test.mergeSort(arr,0,arr.length-1);
		
		System.out.println("After Sorting");
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
class TestMergeSort {
	public void mergeSort(int arr[], int l, int r) {
		if(l<r) {
			//find the mid
			int mid = (l+r)/2;
			
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr,l,r,mid);
		}
	  return;
	}

	public void merge(int arr[], int l, int r, int mid) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int lArr[] = new int[n1];
		int rArr[] = new int[n2];
		
		//copying
		for(int x = 0; x<n1; x++) {
			lArr[x] = arr[l+x];
		}
		for(int x = 0; x<n2; x++) {
			rArr[x] = arr[mid+1+x];
		}
		
		int i=0;
		int j=0;
		int k = l;
		
		while(i<n1 && j<n2) {
			if(lArr[i]< rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}
			else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
		
		return;
	}
}