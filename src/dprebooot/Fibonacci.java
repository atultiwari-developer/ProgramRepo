package dprebooot;

public class Fibonacci {
	static int  []arr;
	public static void main(String[] args) {
		int x = 9;
		int res = getLastFibo(x);
		System.out.println("the res"+res);
		
	}
    
	public static int getLastFibo(int x) {
		if(x<=1) {
			return x;
		}
		return getLastFibo(x-1)+getLastFibo(x-2);
		
	}
	
}
