package str;

public class SumStr {
	
	public static void main(String[] args) {
		String str = "1212243660";
	  System.out.println(isSumStr(str));
		
	}
	
	public  static boolean isSumStr(String str) {
		int n = str.length();
		
		for(int i=1;i<n;i++) {
			for(int j=1;i+j<n;j++) {
				if(checkSumStr(str,0,i,j))
					return true;
			}
		}
		return false;
	}
	
	public static boolean checkSumStr(String str,int beg,int len1,int len2) {
		
		String s1 = str.substring(beg,len1);
		String s2 = str.substring(beg+len1, len2);
		
		String s3 = sumStrDig(s1,s2);
		
		int len3 = s3.length();
		if(len3 > str.length()-len1-len2-beg)
		return false;
		if(len3>=(beg+len1+len2)) {
		if(s3.equals(str.substring(beg+len1+len2, len3))) {
			if(beg+len1+len2+len3==str.length())
				return true;
			
			checkSumStr(str,beg+len1,len2,len3);
		}
		}
		
		return false;
		
	}
	
	public static String sumStrDig(String s1,String s2) {
		if(s1.length()<s2.length()) {
			s1 = s1+s2;
			s2 = s1.substring(0, s1.length()-s2.length());
			s1 = s1.substring(s2.length());

		}
		
		int m = s1.length();
		int n = s2.length();
		
		String ans = "";
		int carry  = 0;
		for(int i=0;i<n;i++) {
	    int ds =  ((s1.charAt(m-1-i) - '0') +(s2.charAt(n-i-1)-'0') + carry)%10;
	    carry =  ((s1.charAt(m-1-i) - '0') +(s2.charAt(n-i-1)-'0') + carry)/10;
        ans = String.valueOf((ds) + ans); 
	    
		}
		
		for(int j = n;j<m;j++) {
			int ds = ((s1.charAt(m-j-1)-'0') + carry)%10;
			carry = ((s1.charAt(m-j-1)-'0') + carry)/10;
	        ans = String.valueOf((ds) + ans); 
		}
		
		   if (carry != 0) 
		        ans = String.valueOf(carry) + ans; 
		   
		    return ans; 		
	}
	
	public static void swap(String s1,String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		
	}

}
