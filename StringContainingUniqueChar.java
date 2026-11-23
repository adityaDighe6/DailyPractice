// 08-09-2026 : Check if a String Contains Only Unique Characters.

package dailypractice;

import java.util.Arrays;

public class StringContainingUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hetal jii";
		
		TestStringContainingUniqueChar test = new TestStringContainingUniqueChar();
		boolean result = test.stringContainingUniqueChar(str);
		
		System.out.println("Result is : "+result);
	}

}
class TestStringContainingUniqueChar {
	public boolean stringContainingUniqueChar(String str) {
		
		if(str == null || str.length() == 0) {
			return false;
		}
		str.toLowerCase();
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i = 0; i<ch.length-1; i++) {
			if(ch[i] == ch[i+1]) {
				return false;
			}
		}
		
		return true;
	}
}