package ds;

public class MaxSumIncSub {
	public static void main(String[] args) {
		int[]arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		int res = getMaxSum(arr,n);
		System.out.println("the res is"+res);
		
	}
	
	public static int getMaxSum(int[]arr,int n) {
		int[]inc = new int [n];
		for(int i=0;i<n;i++) {
			inc[i] = arr[i];
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				
				if(arr[i]>arr[j] && inc[i]<(inc[j]*arr[i])) {
					
					inc[i] = inc[j]*arr[i];
					
				}
			}
		}
		
		int max = inc[0];
		
		for(int i=1;i<n;i++) {
			if(max<inc[i]) {
				max = inc[i];
			}
		}
		
		return max;
		
	}

}
