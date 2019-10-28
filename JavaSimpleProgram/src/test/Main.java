package test;

public class Main {
	
	static {
		System.out.println("Main- Demo");
	}
	
	{
		System.out.println("...............");
	}
	
	public static void main(String[] args) {
		new Demo();
	}
}

class Demo extends Main {
	
	static {
		System.out.println("A - Demo");
	}
	
	{
		System.out.println("*******************");
	}
	
	public void test() {
		System.out.println("5555555555");
	}
	
	
	
}
