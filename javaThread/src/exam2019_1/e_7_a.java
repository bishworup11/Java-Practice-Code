package exam2019_1;

class Student10 {
	int id, age;
	String name;

	Student10(int id, String name, int age) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public boolean equalsTo(Student10 obj) {
		if (this.age == obj.age) {
			return true;
		}

		return false;
	}
}

public class e_7_a {

	public static void main(String[] args) {
		Student10 s1 = new Student10(1, "Roni", 21);
		Student10 s2 = new Student10(2, "Rakib", 18);
		Student10 s3 = new Student10(3, "Partha", 21);
		Student10 s4 = new Student10(4, "Tohid", 23);

		System.out.println(s1.equalsTo(s3));
		System.out.println(s2.equalsTo(s4));

	}

}