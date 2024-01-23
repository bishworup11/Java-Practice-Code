package exam2019_1;

public class e_8_a {

	public static int calculate(String s, int a, int b, int c) {
		if (s == "sS") {
			return a + b - c;
		}
		if (s == "Ss") {
			return a - b + c;
		}
		if (s == "Sm") {
			return (b - a) * c;
		} else
			return (a / b) + c;

	}

	public static void main(String[] args) {
		int a = calculate("sS", 6, 4, 3);
		System.out.println(a);
		int b = calculate("Ss", a, 4, 7);
		System.out.println(b);
		int c = calculate("Sm", a, b, 3);
		System.out.println(c);
		int d = calculate("Ds", c, 3, -3);
		System.out.println(d);

	}

}