package String;

public class StringPlaindrome {
	
	public static void main(String[] args) {
		
		String s = "abba";
		checkPlaindrome(s);
	}

	private static void checkPlaindrome(String s) {
		
		int n = s.length();
		String b = "";
		
		for (int i = n-1; i >= 0; i--) {
			b += s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(b)) {
			System.out.println("String is Plaindrome");
		}
		else {
			System.out.println("Not Plaidrome");
		}
		
	}

}
