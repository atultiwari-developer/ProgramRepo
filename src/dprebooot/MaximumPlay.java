package dprebooot;

public class MaximumPlay {
	
	public static void main(String[] args) {
		int n = 10;
		int res = maxGameWinner(n);
		System.out.println("thye res is"+res);
	}
	
	public static int maxGameWinner(int n) {
		int []arr = new int[n];
		
		arr[0] =1;
		arr[1] = 2;
		int i=2;
		do {
			arr[i] = arr[i-1]+arr[i-2];
		}while(arr[i++]<=n);
		return i-2;
	}

}
