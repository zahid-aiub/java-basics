package String;

public class MaxOccuringCharacter {
	public static void main(String[] args) {
		
		String str = "zahidjannatul";
		findMaxOccouringChar(str);
	}

	private static void findMaxOccouringChar(String str) {
		
		char [] arr = str.toLowerCase().toCharArray();
		
		int maxCount=0;
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				index=i;
			}
		}
		System.out.println(arr[index]);
		
	}
}
