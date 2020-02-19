package atul;

import java.util.HashSet;
import java.util.Set;

public class PairSum {
	
	public static void main(String[] args) {
		
		int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		
		int[] res = fix(arr);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
		 
	}
	
	public static int[] fix(int[]arr) {
		
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i] != -1 && arr[i] != i) {
				int x = arr[i];
				
				while(arr[x] != -1 && arr[x] !=x) {
					
					int y = arr[x];
					arr[x] = x;
					x = y;
				}
				
				arr[x] = x;
				
				if(arr[i] !=i) {
					arr[i] = -1;
				}
				
				
				
			}
			
		}
		
		
		
		return arr;
	}
	
	

	
}
