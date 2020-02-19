package str;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		System.out.println(longestPalindromeString("12321"));
		
		System.out.println(longestPalindromeString("1221"));


	}

	private static String  longestPalindromeString(String str) {
	
		String s = str.substring(0,1);
		for(int i=0;i<str.length();i++) {
			String palin = getPalinDrom(str,i,i);
			if(palin.length()>s.length()) {
				s = palin;
			}
			palin = getPalinDrom(str,i,i+1);
			if(palin.length()>s.length()) {
				s = palin;
			}

		}
		
		
		return s;
	}

	private static String getPalinDrom(String str, int start, int end) {
	 
		if(start>end) {
			return null;
		}
		while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)) {
			start--;
			end++;
		}
		return str.substring(start+1,end);
	}

}
