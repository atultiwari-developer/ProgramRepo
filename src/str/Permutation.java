package str;

public class Permutation {
	
	public static void main(String[] args) {
		String str = "ABC";
		
		int len  =str.length();
		generatePermute(str,0,len);
	}

	private static void generatePermute(String str, int start,int end) {
		
		if(start==end-1) {
			System.out.println(str);
		}
		
		for(int i=start;i<end;i++) {
			str  = swapStr(str,start,i);
			generatePermute(str,start+1,end);
			str  = swapStr(str,start,i);

		}
		
		
	}

	private static String swapStr(String str, int i, int j) {
		
		char[]arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return String.valueOf(arr);
	}
	
	

}
