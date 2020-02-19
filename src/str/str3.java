package str;

public class str3 {
	
	public static void main(String[] args) {
		int n = 20;
		printSmallest(n);
		
	}
	
	public  static void printSmallest(int n) {
		if(n==0) {
			System.out.println("0");
		}
		if(n%9 !=0) {
			System.out.print(n%9+" ");
		}
		
	    for(int i=1;i<=n/9;i++) {
	    	System.out.print("9"+" ");
	    }
	    
	    for(int i=1;i<=n;i++) {
	    	System.out.print("0"+" ");
	    }
		
	}

}
