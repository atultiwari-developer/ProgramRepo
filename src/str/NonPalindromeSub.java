package str;

public class NonPalindromeSub {
	
	
	public static void main(String[] args) {
		String str = "abbac";	
		int x = maxLen(str);
		System.out.println("the length is"+x);
	}
	
	public static int maxLen(String str) {
		int n = str.length();
		char ch  = str.charAt(0);
		int i;
		for(i=1;i<n;i++) 
			if(str.charAt(i) !=ch) 
				break;
	    if(i==n)
	    	return 0;
	    
	    if(isPalindrome(str,n)) {
	    	return n-1;
	    }
	    return n;
	}
	
	public static  boolean isPalindrome(String str,int n) {
		for(int i=0;i<n;i++) {
			if(str.charAt(i) != str.charAt(n-i-1))
				return false;
		}
		return true;
	}

}
