package arrray.dp;

import java.util.Arrays;

public class Tabulization {
	
	public static void main(String[] args) {
		int[]arr = new int[10];
		
		Arrays.fill(arr,-1);
		
		arr[0]=0;
		arr[1] = 1;
		int n =5;
		
		for(int i=2;i<=n;i++) {
			arr[i] = arr[i-1]+ arr[i-2];
		}
		System.out.println(arr[n-1]);
	}

}
