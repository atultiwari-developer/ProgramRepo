package dprebooot;

public class WilliamPro {
	static int []arr;
	public static void main(String[] args) {
	    int n = 3;
	    arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		printWill(n);
	}
	
	public static void printWill(int n) {
		
		for(int i=2;i<=n;i++) {
			if(n==0 || n==1) {
				arr[n] = 1;
			}
			arr[i] = 2*arr[i-1]+arr[i-2];
			System.out.println(arr[i]);
		}
		
	}

}
