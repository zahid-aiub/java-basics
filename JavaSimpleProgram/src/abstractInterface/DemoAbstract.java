package abstractInterface;

public abstract class DemoAbstract implements InterfaceOne {

	
	final int x = 10;
	abstract void abstractClassMethod();
	
	@Override
	public void interfOneMethod() {
		System.out.println("interfOneMethod implement from Abstract class");
	}
	
	public void abstractDemo() {
		System.out.println("In Abstract Class");
	}
	
	
}
