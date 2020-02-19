package arrray;

import java.util.Arrays;

public class Array {
public static void main(String[] args) {
	int[]arr = {4,3,4,3,3,2,1,1,3,5,6,3,2,1};
	int max= arr[0];
	int n = arr.length;
	for(int i=1;i<n;i++) {
		if(max<arr[i] ) {
			max = arr[i];
		}
	}
	int []brr = new int[max+1];
	int j= 0;
	for(int i=0;i<n;i++) {
		brr[arr[i]]++;
	}
	int min = Integer.MAX_VALUE;
	
	for(int i=1;i<brr.length;i++) {
		if(min>arr[i]) {
			min = arr[i];
		}
	}
}
}
