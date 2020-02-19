package str;

public class SwapStr {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cde";
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
	
	public static void swap(String str1,String str2) {
		String temp = str1;
		str1  = str2;
		str2 = temp;
	}

}
