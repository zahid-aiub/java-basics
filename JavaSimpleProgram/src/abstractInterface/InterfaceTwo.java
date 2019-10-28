package abstractInterface;

public interface InterfaceTwo extends InterfaceOne{
	
	public void interfTwoMethod();
	
	@Override
	default void interfOneMethod() {
		System.out.println("interface method call from another interface");
		
	}
}
