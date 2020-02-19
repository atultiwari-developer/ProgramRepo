package str;

public class DivBy4 {
	
	public static void main(String[] args) {
		String str = "76952";
		int x = str.length();
		
		boolean ans = isDivBy4(str,x);
		
		System.out.println("the nun is divi by 4"+ans);
		
	}

	private static boolean isDivBy4(String str, int x) {
		
		if(str.length()==1 && (str.charAt(x)-'0')==0) {
			return false;
		}
		else if(str.length()==1 && (str.charAt(x)-'0')==4) {
			return true;
		}
		
		int secondLast = str.charAt(x-2)-'0';
		int last = str.charAt(x-1)-'0';
		return (secondLast*10 + last)%4==0;
		
	}

}
