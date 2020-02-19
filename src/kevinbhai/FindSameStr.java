package kevinbhai;

import java.util.Arrays;

public class FindSameStr {


	public static void main(String[] args) {
		String str = "aabcbcdbca";
		
		System.out.println("find the string itself   "+findStrItself(str));
	}
	
	public static String findStrItself(String str) {
		
		boolean []arr = new boolean[256];
		Arrays.fill(arr,false);
		int dist_count = 0;
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]==false) {
				arr[str.charAt(i)] = true;
				dist_count++;
			}
		}
		
		int start = 0;
		int start_index = -1;
		int count = 0;
		int[] curr_arr = new int[256];
		int min_len = Integer.MAX_VALUE;
		int n = str.length();
		for(int j=0;j<n;j++) {
			curr_arr[str.charAt(j)]++;
			
			if(curr_arr[str.charAt(j)]==1) {
				count++;
			}
			
			if(count==dist_count) {
				while(curr_arr[str.charAt(j)]>1) {
					if(curr_arr[str.charAt(j)]>1) {
						curr_arr[str.charAt(j)]--;
						start++;
					}
				}
				
				int let_window = j-start+1;
			if(min_len > let_window) {
				min_len = let_window;
				start_index = start;
			}
				
			}
			
		}
		
		
		
		return str.substring(start_index, start_index+min_len);
		
	}
	
}
