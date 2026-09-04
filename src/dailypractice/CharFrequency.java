package dailypractice;

import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of '" + ch + "' = " + count);
	}

}
