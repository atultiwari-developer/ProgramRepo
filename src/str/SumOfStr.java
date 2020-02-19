package str;

public class SumOfStr {
	public static void main(String[] args) {
//		String str1 = "3333311111111111";
//		String str2 = "44422222221111";

		String str1 = "3425";
		String str2 = "21676";
		
		if(str1.length()<str2.length()) {
			str1 = str1+str2;
			str2 = str1.substring(0, str1.length()-str2.length());

			str1 = str1.substring(str2.length());
			
		}
		
		
		System.out.println("str1 is"+str1);
		System.out.println("str2"+str2);
		
		int n= str1.length();
		int m = str2.length();
		
		String str="";
		int carry = 0;
		for(int i=0;i<m;i++) {
			int sum = ((str1.charAt(n-1-i)-'0') + (str2.charAt(m-1-i)-'0') + carry)%10;
			carry = ((str1.charAt(n-1-i)-'0') + (str2.charAt(m-1-i)-'0') + carry)/10;
			str+= String.valueOf(sum);
			
		}
		
		for(int i=m;i<n;i++) {
			int sum = ((str1.charAt(n-1-i)-'0') + carry) %10;
			carry =  ((str1.charAt(n-1-i)-'0') + carry) /10;
			str+=String.valueOf(sum);
		}
		
		if(carry != 0) {
			str+=String.valueOf(carry);
		}
		System.out.println(str);
		System.out.println(new StringBuilder(str).reverse());
		
	}

}
