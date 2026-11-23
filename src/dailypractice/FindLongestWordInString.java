//10-09-2026 : Find the Longest Word in a String.

package dailypractice;

public class FindLongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aditya Mangesh Dighe";
		
		TestFindLongestWordInString test = new TestFindLongestWordInString();
		String result = test.findLongestWordInString(str);
		
		System.out.println("Longest word is : "+result);
	}
}
class TestFindLongestWordInString {
	public String findLongestWordInString(String str) {
		
		if(str == null || str.trim().isEmpty()) {
			return "";
		}
		
		String words[] = str.trim().split("\\s+");
		String longestword = "";
		
		for(String word : words) {
			if(word.length() > longestword.length()) {
				longestword = word;
			}
		}
		return longestword;
	}
}