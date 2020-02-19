package str;

public class DecimaRep {
	
	public static void main(String[] args) {
		String str = "10000101001";
		
		int x= 0;
		int len = str.length();
		int pos = 0;
		for(int i = len-1;i>=0;i--) {
			x = x+ (str.charAt(i)-'0')*(int)Math.pow(2, pos);
			pos = pos+1;
		}
		
		if(x%5==0) {
			System.out.println(x);
		}
	}

}
