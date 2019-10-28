package series;

public class OneToNinePrintByOneLoop {
	
	public static void main(String[] args) {
		
		int j = 0;
		for (int i = 9; i <= 9; ) {
			System.out.println(i);
			if (j == 0) {
				i--;
			}else {
				i++;
			}
			if (i == 1) {
				j = 1;
			}
			
		}
		
	}
	
}
