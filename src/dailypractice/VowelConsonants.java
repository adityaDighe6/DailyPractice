package dailypractice;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		TestVowelsConsonants test = new TestVowelsConsonants();
		test.vowelConsonants(str);
	}

}
class TestVowelsConsonants {
	public void vowelConsonants(String str) {
		int vowels = 0;
		int consonants = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				
				if("AEIOUaeiou".indexOf(ch) != -1) {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels are : "+vowels);
		System.out.println("Consonants are : "+consonants);
		
		return;
	}
}