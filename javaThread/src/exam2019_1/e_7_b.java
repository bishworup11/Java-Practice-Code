package exam2019_1;

import java.util.ArrayList;

class Student11 {
	int age;
	String name;

	public Student11(int age, String name) {
		this.age = age;
		this.name = name;

	}
}

public class e_7_b {

	public static void main(String[] args) {
		ArrayList<Student11> s11 = new ArrayList<>();
		Student11 s1 = new Student11(21, "Roni Hossain");
		Student11 s2 = new Student11(25, "Rakib Hossain");
		Student11 s3 = new Student11(21, "Partha Das");
		Student11 s4 = new Student11(24, "Shamim Patwary");

		s11.add(s1);
		s11.add(s2);
		s11.add(s3);
		s11.add(s4);

		int max = s1.age;
		String maxPerson = "";
		for (Student11 s : s11) {
			if (s.age > max) {
				maxPerson = s.name;
				max = s.age;

			}

		}
		System.out.println(maxPerson);

	}

}