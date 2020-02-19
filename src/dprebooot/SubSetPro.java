package dprebooot;

public class SubSetPro {
	
	public static void main(String[] args) {
		int []arr = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		int m = arr.length;
		boolean res = sumExist(arr,m,sum);
		System.out.println(res);
	}
	public static  boolean sumExist(int[]arr,int m,int sum) {
		if(sum==0) {
			return true;
		}
		
		if(m<=0 && sum>0) {
			return false;
		}
		if(sum<0) {
			return false;
		}
		return sumExist(arr,m-1,sum-arr[m-1]) || sumExist(arr,m-1,sum);
	}

}
