package str;

public class AtulSum {
	
	public static void main(String[] args) {
		String str ="891";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0' || str.charAt(i)=='1' || sum==1 || sum==0) {
				sum = sum + (str.charAt(i)-'0');
			}
			else {
				sum = sum * (str.charAt(i)-'0');
			}
		}
		
		System.out.println("the sum is"+sum);
		
	}

}
