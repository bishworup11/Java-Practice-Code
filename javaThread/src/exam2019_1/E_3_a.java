package exam2019_1;

abstract class person {
	abstract void hasName();

	abstract void hasAge();

	abstract void hasAddress();
}

abstract class engineer extends person {
	abstract void hasQuality();

	private void hasfeildwork() {

	}

}

class consultan extends engineer {

	@Override
	public void hasName() {
		// TODO Auto-generated method stub
		System.out.println("1");

	}

	@Override
	public void hasAge() {
		// TODO Auto-generated method stub
		System.out.println("2");

	}

	@Override
	public void hasAddress() {
		// TODO Auto-generated method stub
		System.out.println("3");

	}

	@Override
	void hasQuality() {
		// TODO Auto-generated method stub
		System.out.println("1");

	}

}

public class E_3_a {
	public static void main(String[] args) {
		consultan c = new consultan();
		c.hasAddress();
		c.hasName();
		c.hasAge();
		c.hasQuality();
	}

}
