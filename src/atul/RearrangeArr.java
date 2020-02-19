package atul;

import java.util.Arrays;

public class RearrangeArr {
public static void main(String[] args) {
	int[]arr = {5, 8, 1, 4, 2, 9, 3, 7, 6};
	int n=  arr.length;
	rearrangeArr(arr,n);
}

public static void rearrangeArr(int[]arr,int n) {
	   Arrays.sort(arr);
	   
	   int a=0,b=n-1;
	   int ans[] = new int[n];
	   
	   for(int i=0;i<n;i++) {
		   if(i%2==0) {
			  ans[i] = arr[a++]; 
		   }else {
				  ans[i] = arr[b--]; 

		   }
	   }
	   
	   for(int x=0;x<n;x++) {
		 System.out.print(ans[x]+" ");  
	   }
	
}
}
