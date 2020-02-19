package dprebooot;

import java.util.Arrays;

public class MaxBitonicSub {
	public static void main(String[] args) {
		
		int[]arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int n = arr.length;
		int[]lis = getLCS(arr,n);
//		for(int i=0;i<n;i++) {
//			System.out.println(lis[i]);
//		}
        int[]lds = getLDS(arr,n);
        
        int x = lis[0]+lds[0]-1;       
        for(int i=1;i<n;i++) {
        	if(x < lis[i]+lds[i]-1) {
        		x = lis[i]+lds[i]-1;
        	}
        }
        
        System.out.println("longest bitonic sub"+x);
        
		
      }

	
	
	public static int[] getLCS(int[]arr,int n) {
		int[]lis = new int[n];
		Arrays.fill(lis,1);
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && lis[i] <lis[j]+1) {
					lis[i] = lis[j]+1; 
				}
			}
		}		
		return lis;
	}
	
	public static int[]getLDS(int[]arr,int n){
		int[]lds = new int[n];
		Arrays.fill(lds, 1);
		for(int i=n-2;i>=0;i--) {
			for(int j=n-1;j>i;j--) {
				if(arr[i]>arr[j] && lds[i] < lds[j]+1) {
					lds[i] = lds[j]+1;
				}
			}
		}
		return lds;
		
	}

}
