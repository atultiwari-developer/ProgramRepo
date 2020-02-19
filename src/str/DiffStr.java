package str;

public class DiffStr {
	
	public static void main(String[] args) {
		String str1 = "122387876566565674";
		String str2 = "31435454654554";
		
		String myStr = retutnDiff(str1,str2);
		String mynewStr = new StringBuilder(myStr).reverse().toString();
		System.out.println(mynewStr);
		
		
	}
	
	public static String retutnDiff(String str1,String str2) {
		
		if(str1.length()<str2.length()) {
			String t = str1;
			str1 = str2;
			str2 = str1;
		}
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		int carry = 0;
		String res = "";
		String sb1 = new StringBuilder(str1).reverse().toString();
		String sb2 = new StringBuilder(str2).reverse().toString();
		for(int i=0;i<n2;i++) {
			int x = ((sb1.charAt(i)-'0')-(sb2.charAt(i)-'0')-carry);
			if(x<0) {
				x = x+10;
				carry = 1;
			}
			else {
				carry = 0;
			}
			res = res + x;
		}
		for(int j=n2;j<n1;j++) {
			int x = ((sb1.charAt(j)-'0')-carry);
			if(x<0) {
				x = x+10;
				carry = 1;
			}
			else {
				carry = 0;
			}
			res = res +x;
			
			
		}
		
		
		return res;
	}

}
