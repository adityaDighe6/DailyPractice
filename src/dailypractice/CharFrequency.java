package dailypractice;

import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		
		String lower = str.toLowerCase();
		System.out.println("Entered string is converted to lowercase : "+lower);
		
		char ch;
		
		System.out.println("Enter the character for couting frequency : ");
		ch = sc.next().charAt(0);
		
		TestCharFrequency test = new TestCharFrequency();
		int countFrequency = test.testCharFrequency(lower, ch);
		
		System.out.println("Frequency of character "+ ch +" in string is : "+countFrequency);
		
	}
}

class TestCharFrequency {
	public int testCharFrequency(String lower, char ch) {
		
		int count = 0;
		
		for(int i = 0; i<lower.length(); i++) {
			if(lower.charAt(i)==ch) {
				count++;
			}
		}
		
		return count;
	}
}