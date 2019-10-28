package abstractInterface;

public class TestAll extends DemoAbstract implements InterfaceOne, InterfaceTwo {
	
	public TestAll() {
		System.out.println("Constrauctor Called");
	}
	static {
		System.out.println("Static block called");
	}
	{
		System.out.println("Block called");
		
	}
	
	
	@Override
	public void interfOneMethod() {
		System.out.println("interface one Method called");
		
	}

	@Override
	public void interfTwoMethod() {
		System.out.println("interface two Method call");
		
	}

	@Override
	void abstractClassMethod() {
		System.out.println("demo abstract method called");
		
	}

	
}
