package str;

public class LongetsPalindrmGeeks {
	
	public static void main(String[] args) {
	  String str = "abaabc";
	  int len = str.length();
	  String res = getLongestPalindrome(str,len);
	  System.out.println("the string is"+res);
	}
	
	public static String  getLongestPalindrome(String str,int len){
		boolean[][] arr = new boolean[len][len];
		int maxLen = 1;
		for(int i=0;i<len;i++) {
			arr[i][i] = true;
		}
		int start = 0;
		for(int i=0;i<len-1;i++) {
			if(str.charAt(i)==str.charAt(i+1))
			arr[i][i+1] = true;
			maxLen  =2;
			start = i;
		}
		for(int k=3;k<=len;k++) {
			for(int i=0;i<len-k+1;i++) {
				int j = i+k-1;
				if(arr[i+1][j-1]==true && str.charAt(i)==str.charAt(j)) {
					if(k>maxLen) {
						start = i;
						maxLen = k;
					}
				}
			}
		}
		
		return str.substring(start,start+maxLen);
	}

}
