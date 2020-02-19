package str.charactercountbased;

public class CharacteReplace {
	
	public static void main(String[] args) {
		int count = 0;
		String str = "abc";		
		System.out.println("count the word possible "+countStr(str));
	}
	
	public static int countStr(String str) {
		int count = 1;
		int len  =str.length();
		if(len==1) {
			return len;
		}
		
		if(str.charAt(0)==str.charAt(1)) {
			count*=1;
		}
		else {
			count*=2;
		}
		
		for(int j=1;j<len-1;j++) {
			if(str.charAt(j-1)==str.charAt(j) && str.charAt(j)==str.charAt(j+1)) {
				count*=1;
			}
			else if(str.charAt(j-1)==str.charAt(j)
					|| str.charAt(j)== str.charAt(j+1)
					|| str.charAt(j-1)==str.charAt(j+1))
			{
				    count*=2;
			}
			else {
				count *=3;
			}
		}
		
		if(str.charAt(len-1)==str.charAt(len-2)) {
			count*=1;
		}
		else
			count*=2;
		
		return count;
		
	}

}
