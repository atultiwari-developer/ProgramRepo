package kevinbhai;

import java.util.Arrays;

public class FindSubStrKLength {
	
	public static void main(String[] args) {
	      String str = "abcbaa"; 
	      int k = 3;	      
       System.out.println("the str with k dist char is "+findAllSub(str,k));
	}
	
	public static int findAllSub(String str,int k) {
		int []arr = new int[26];
		int n = str.length();
		int res = 0;
		for(int i=0;i<n;i++) {
			Arrays.fill(arr,0);
			int distCount = 0;
			for(int x =i;x<n;x++) {
				
				arr[str.charAt(x)-'a']++;
				if(arr[str.charAt(x)-'a']==1) {
					distCount++;
				}
				if(distCount==k) {
					res++;
				}
			}
			
		}
		
		return res;
	}

}
