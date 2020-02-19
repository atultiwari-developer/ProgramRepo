package arrray;

public class Highest2D {
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,5,9},{10,11,13},{12,13,15}};
		int k  = 8;
		int res = kthSmallest(arr,k);
		System.out.println("the res is"+res);
	}

	private static int kthSmallest(int[][] arr, int k) {
		int m = arr.length;
		int low = arr[0][0];
		int high = arr[m-1][m-1];
		
		while(low<high) {
			int mid = low +(high-low)/2;
			
			int count = countEle(arr,mid);
			if(count<k) {
				low = mid+1;
			}
			else {
				high = mid;
			}
			
		}
		return high;
	}

	private static int countEle(int[][] arr, int mid) {
		
		int m = arr.length;
		int i=  m-1;
		int j = 0;
		int count = 0;
		while(i>=0 && j<m) {
			if(arr[i][j]<=mid) {
				count = count+i+1;
				j++;
			}
			else {
				i--;
			}
			
		}
		
		
		return count;
	}

}
