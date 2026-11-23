package dailypractice;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'M';
		
		TestAsciiValue test = new TestAsciiValue();
		
		int value = test.asciiValue(ch);
		
		System.out.println("ASCII value of "+ch+" is : "+value);
	}

}
class TestAsciiValue {
	public int asciiValue(char ch) {
		
		int asciiValue = (int)ch;
		
		return asciiValue;
	}
}