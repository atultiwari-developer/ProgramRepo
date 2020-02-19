package dprebooot;

public class SubsetSumPro {
	
	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		int n  = set.length;
		boolean ans = sumExist(set,sum,n);
		System.out.println("the ans is"+ans);
	}

	private static boolean sumExist(int[] set, int sum, int n) {
		if(sum==0)
			return true;
		if(n==0 && sum != 0) {
			return false;
		}
		
		if(set[n-1]>sum)
			return sumExist(set,sum,n-1);
		
		return sumExist(set,sum,n-1)||sumExist(set,sum-set[n-1],n-1);
	}

}
