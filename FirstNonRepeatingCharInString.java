//07-09-2026 : Find the First Non-Repeating Character in a String.

package dailypractice;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		
		TestFirstNonRepeatingCharInString test = new TestFirstNonRepeatingCharInString();
		char repChar = test.firstNonRepeatingCharInString(str);
		
		System.out.println("First non repetiting character is : "+repChar);
	}

}

class TestFirstNonRepeatingCharInString {
	public char firstNonRepeatingCharInString(String str) {
		
		if(str == null || str.length() == 0) {
			return '\0';
		}
		
		//freq array to keep track
		int charCount[] = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			charCount[str.charAt(i)]++;
		}
		
		for(int i = 0; i<str.length(); i++) {
			if(charCount[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}
		
		return '\0';
	}
}
