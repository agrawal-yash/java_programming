import java.util.*;

class MyOwnException extends Exception {
	public MyOwnException(String msg) {
		super(msg);
	}
}

class ThrowDemo {
	static void employeeAge(int age) throws MyOwnException {
		if (age < 0)
			throw new MyOwnException("Age can't be less than zero");
		else if (age > 60)
			throw new MyOwnException("Age can't be greter than 60");
		else
			System.out.println("Input is valid!!");
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = scn.nextInt();
		try {

			employeeAge(a);
		} catch (MyOwnException e) {
			System.out.println(e.getMessage());
		}
	}
}