package dailypractice;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "Aditya";
		String middlename = "Mangesh";
		String surname = "Dighe";
		
		TestStringConcat test = new TestStringConcat();
		String name = test.stringConcat(firstname, middlename, surname);
		
		System.out.println("Name is : "+name);
	}

}
class TestStringConcat {
	public String stringConcat(String firstname, String middlename ,String surname) {
		
		if((firstname == null || firstname.length() == 0) &&
				(middlename == null || middlename.length() == 0) &&
				(surname == null || surname.length() == 0)) {
			return "";
		}
		
		String fullname = firstname.concat(" "+middlename.concat(" "+surname));
		
		return fullname;
	}
}