package exam2019_1;

import java.util.Scanner;

class MyInvallidityCheckException extends Exception {
	MyInvallidityCheckException(String s) {
		super(s);
	}
}

public class e_6_a {

	public static void validNumber(int n) throws MyInvallidityCheckException {
		if (n < 20 || n > 100)
			throw new MyInvallidityCheckException("Number is not vallid....");
		else
			System.out.println("Wow....Number is between 20 to 100");
	}

	public static void validString(String s) throws MyInvallidityCheckException {
		if (!searchcapital(s))
			throw new MyInvallidityCheckException("String doesn't contain any Character....");
		else
			System.out.println("Wow....String is Perfect.");
	}

	public static boolean searchcapital(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) throws MyInvallidityCheckException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc2.nextLine();
		try {
			validNumber(n);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			validString(s);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
