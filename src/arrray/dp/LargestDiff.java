package arrray.dp;

public class LargestDiff {
	
	public static void main(String[] args) {
		int []arr = {2, 3, 10, 6, 4, 8, 1};
		//int []arr = {7, 9, 5, 6, 3, 2};
		System.out.println("the diff is"+largerDiff(arr,arr.length));
	}
	
	public static  int largerDiff(int[]arr,int n) {
		int maxDiff = Integer.MIN_VALUE;
		 int maxRight = arr[n-1];
		 int ele1 = Integer.MIN_VALUE;
		 int ele2 = Integer.MIN_VALUE;
		for(int i=n-2;i>=0;i--) {
			if(arr[i] >maxRight) {
				maxRight = arr[i];
			}
			else {
				int diff = maxRight-arr[i];
				if(maxDiff < diff) {
					maxDiff = diff;
				}
			}
		}
		
		System.out.println("ele1 is"+ele1);
		System.out.println("ele2 is"+ele2);
		
		return maxDiff;
	}

}
