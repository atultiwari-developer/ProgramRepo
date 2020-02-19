package dprebooot;

public class CountDiff {
	
	public static void main(String[] args) {
	int n  =2;
	int diff = 0;
	
	int x = getCount(n,diff);
	System.out.println("the value is"+x);
	
	}

	private static int getCount(int n, int diff) {
		if(Math.abs(diff)>n) {
			return 0;
		}
		if(n==1 && diff==0) {
			return 2;
		}
		if(n==1 && Math.abs(diff)==1) {
			return 1;
		}
		int res = getCount(n-1,diff-1)+ 2*getCount(n-1,diff)+getCount(n-1,diff+1);
		
		return res;
	}

}
