package dailypractice;

public class CountRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCountRecursion test = new TestCountRecursion();
		test.count(6);
	}

}
class TestCountRecursion {
	public void count(int n) {
		if(n>0) {
			System.out.println(n+" ");
			count(n-1);
		}
	}
}
