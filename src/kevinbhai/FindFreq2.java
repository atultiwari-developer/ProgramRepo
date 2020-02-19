package kevinbhai;

import java.util.Arrays;

public class FindFreq2 {
	
	public static void main(String[] args) {
		String str = "aabbcc";
		int k = 2;
		System.out.println("the same value is"+findResSub(str,k));
	}
	
	public static int findResSub(String str,int k) {
		int n  =str.length();
		int[]arr = new int[26];
		int res = 0;
		
		for(int i=0;i<n;i++) {
			Arrays.fill(arr, 0);
		    for(int j=i;j<n;j++) {
		    	arr[str.charAt(j)-'a']++;
		    	
		    	if(arr[str.charAt(j)-'a']>k) {
		    		break;
		    	}
		    	else if(arr[str.charAt(j)-'a'] ==k && check(arr,k)) {
		    		res++;
		    	}
		    }
		}
		
		return res;
	}

	private static boolean check(int[] arr, int k) {
		
		for(int i=0;i<26;i++) 
			if(arr[i] !=0 && arr[i]!=k)
				return false;
			
		return true;
	}

}
