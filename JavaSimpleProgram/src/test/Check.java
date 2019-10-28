package test;

public class Check {
	
	public void print(String str) {
		str= "hello ...";
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Check check = new Check();
		String str = "ABC..";
		check.print(str );
		System.out.println("Main Class...!");
	}
}
