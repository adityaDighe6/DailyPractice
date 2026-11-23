/* 
 16-09-2026
 Data structure starts
 Recursion : In simple terms function calls itself. 
 */

package dailypractice;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		TestRecursion test = new TestRecursion();
		int result = test.factorial(num);
		
		System.out.println("Result is : "+result);
	}
	
}
class TestRecursion {
	public int factorial(int num) {
		
		if(num != 0)
			return num * factorial(num-1);
		
		return 1;
	}
}