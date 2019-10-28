package number;

public class FactorialByRecurssion {
	
	public static void main(String[] args) {
		
		int fact = 1;
		int numb = 5;
		fact = factorial(numb);
		System.out.println(fact);
	}
	
	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return (n * factorial(n-1));
		}
	}
}
