package number;

public class PrimeNumbRange {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 100;
		printPrimeNumber(a,b);
	}

	private static void printPrimeNumber(int a, int b) {
		
		int num = 0;
		
		for (int i = a; i <= b; i++) {
			int count = 0;
			
			for (num = i;  num>= 1; num--) {
				if (i%num == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
		
	}
}
