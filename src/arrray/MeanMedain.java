package arrray;

import java.util.Arrays;

public class MeanMedain {
	
	public static void main(String[] args) {
		int[]arr = {4, 4, 4, 4, 4};
		
		int n = arr.length;
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];			
		}
		System.out.println("the mean is"+(double)sum/(double)n);
		
		Arrays.sort(arr);
		
		if(n%2 !=0) {
			System.out.println((double) arr[n/2]);
		}
		else {
			System.out.println(((double) arr[(n-1)/2] +(double) arr[n/2])/2.0);
		}
		
				
	}

}
