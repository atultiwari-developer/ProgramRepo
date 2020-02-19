package recursion;

public class LongestReapitingSub {
	
	public static void main(String[] args) {
		String str = "aabb";
		char[]arr = str.toCharArray();
		int x = arr.length;
		int y = arr.length;
		System.out.println("the length is"+getSubSeqLen(arr,x,y));
	}
	
	public static int getSubSeqLen(char[]arr,int x,int y) {
		if(x==0 || y==0) {
			return 0;
		}
		else if(arr[x-1]==arr[y-1] && x !=y) {
			return 1+getSubSeqLen(arr,x-1,y-1);			
		}
		else
			return Math.max(getSubSeqLen(arr,x,y-1), getSubSeqLen(arr,x-1,y));
	}

}
