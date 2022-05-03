package abstractInterface;


class Base {
	public void foo() {
		System.out.println("Base");
	}
}

class Derived extends Base {

	// works fine
	@Override
	public void foo() {
		System.out.println("Derived");
	}
}

public class Main {
	public static void main(String args[]) {
		Base d = new Derived();
		d.foo();     // Run-time polymorphism

	}
}