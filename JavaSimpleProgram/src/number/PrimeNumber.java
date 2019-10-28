package number;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int a = 7;
		printPrimeNumber(a);
		
	}

	private static void printPrimeNumber(int n) {
		
		int flag = 0;
		int m = n / 2;
		if (n ==0 || n == 1) {
			System.out.println(n+ " is Not a Prime Number");
		}
		else {
			for (int i = 2; i <= m; i++) {
				if (n%i == 0) {
					System.out.println( n +" is Not a Prime Number");
					flag++;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n +" is a Prime Number");
			}
		}
		
	}

}
