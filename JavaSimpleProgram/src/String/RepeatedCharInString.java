package String;

public class RepeatedCharInString {
	
	public static void main(String[] args) {
		
		String s = "apple";
		chekRepeatedString(s);
	}

	private static void chekRepeatedString(String s) {
		
		char [] array = s.toLowerCase().toCharArray();
		int count=0;
		int index=-1;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					array[j] = ' ';
				}
			}
			
			if (count > 0) {
				System.out.println(array[i]);
			}
		}
	}

}
