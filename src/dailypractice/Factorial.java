//12-09-2026 : Find a factorial of a number without recursion.

package dailypractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		
		TestFactorial test = new TestFactorial();
		
		if(number < 0) {
			System.out.println("todo");
		}
		else {
			long result = test.factorial(number);
			System.out.println("Factorial of "+number+" is "+result);
		}
	}
}
class TestFactorial {
	public long factorial(int number) {
		int fact = 1;
		for(int i = 1; i<=number; i++) {
			fact = fact * i;
		}
			
		return fact;
	}
}