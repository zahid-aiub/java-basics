package test;

public class StringCompare {
	
	public static void main(String[] args) {
		
		Long x = new Long(45);
		Long y = new Long(45);
		
		if (x.equals(y)) {
			System.out.println("Worked...!");
		}
		else {
			System.out.println("Not Worked");
		}
		
	}
}
