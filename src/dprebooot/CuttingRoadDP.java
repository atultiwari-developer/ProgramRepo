package dprebooot;

import java.util.Arrays;

public class CuttingRoadDP {
	static int arr[];
	public static void main(String[] args) {
		int[]price = {1, 5, 8, 9, 10, 17, 17, 20};
	     
		int n = price.length;
		arr = new int[n+1];
		Arrays.fill(arr,-1);
		arr[0] = 0;
		int x = calRoadDist(price,n);
		System.out.println("the ans is"+x);
		
	}

	private static int calRoadDist(int[] price, int n) {
		
		if(arr[n] ==-1) {
			int max = Integer.MIN_VALUE;
			for(int i=1;i<=n;i++) {
					for(int j=0;j<i;j++) {
						max = Math.max(max, price[j]+calRoadDist(price,i-j-1));
				}
					arr[i] = max;
			}

		}
	
		
		return arr[n];
	}

}
