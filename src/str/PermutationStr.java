package str;

public class PermutationStr {
	
	public static void main(String[] args) {
		String str = "abc";
		int len  =str.length();
		printPerm(str,len);
	}
	
	public static void printPerm(String str,int len){
		//char ch = str.charAt(0);
		for(int i=0;i<len;i++) {
			System.out.println(swap(str,0,i));
			System.out.println(swap(str,1,i));
			System.out.println(swap(str,2,i));

			//printPerm(str,len-1);
		}
		
		
	}
	
	public static String swap(String str,int start,int end) {
		char[]arr = str.toCharArray();
		char temp = ' ';
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		return String.valueOf(arr);
	}

}
