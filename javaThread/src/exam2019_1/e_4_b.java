package exam2019_1;

public class e_4_b {

	public static void main(String[] args) {
		String str = "Divide";
		int[] arr = { 2, 5, 1, 7, 32 };
		int b = 0;
		try {
			if (str.matches("Divide")) {
				try {
					for (int i = 1; i <= 5; i++) {
						System.out.println(arr[i] / 1);
						b = arr[i] - b;
					}
				} catch (ArithmeticException e) {
					System.out.println(e);
				}

				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
			}

		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}
}
