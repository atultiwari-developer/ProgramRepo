package recursion;

public class LongestCommonSub {
	public static void main(String[] args) {
		String str1 = "ABCDGH";
		String str2 = "AEDFHR";
		char[]arr = str1.toCharArray();
		int x = arr.length;
		char[]brr = str2.toCharArray();
		int y = brr.length;
		int res = getCommnLen(arr,brr,x,y);
		System.out.println("the res is"+res);
	}
	
	public static int getCommnLen(char[]arr,char[]brr,int x,int y){
		if(x==0 || y==0)
			return 0;
		else if(arr[x-1]==brr[y-1])
		return 1+getCommnLen(arr,brr,x-1,y-1);
		else 
			return Math.max(getCommnLen(arr,brr,x,y-1), getCommnLen(arr,brr,x-1,y));
		
	}

}
