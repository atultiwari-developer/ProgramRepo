package dprebooot;

public class UgliNo {
	public static void main(String[] args) {
		int n = 11;
		int res = getUglyNum(n);
		System.out.println("the result is"+res);
		
		
	}
	
	public static int getUglyNum(int n) {
		int x =1;
		for(int i=1;i<=n;) {
			if(checkUgly(x))
			{
			i++;	
			}
			x++;
			}
			
		
		return x-1;
	}
	
	public static boolean checkUgly(int x) {
		if(x==1) {
			return true;
		}
		while(x>1) {
			if(x%2==0) {
				x = x/2;
			}
			else if(x %3==0) {
				x = x/3;
			}
			else if(x%5==0) {
				x = x/5;
			}
			else {
				return false;
			}
		}
		if(x==1) {
			return true;
		}
		return false;
		
	}

}
