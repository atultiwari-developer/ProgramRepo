package str;

public class SumOfDigitInStr {
	
	public static void main(String[] args) {
		String str = "100klh564abc365bg";
		int sum = 0;
		int num =0,res=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num = num*10 +(str.charAt(i)-'0') ;
			}
			else {
				res = Math.max(num, res);
				num = 0;
			}
		}
		
		System.out.println("the max val  is"+res);
	}

}
