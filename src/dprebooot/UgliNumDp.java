package dprebooot;

public class UgliNumDp {
	
	public static void main(String[] args) {
		int x = 20;
		System.out.println("the value is"+getUgliNum(20));
		
		
	}
	
	public static int getUgliNum(int n) {
		int n2=0,n3=0,n5=0;
		int[]ugly = new int[n];
		ugly[0]= 1;
		int nextUgly2 = 2;
		int nextUgly3 = 3;
		int nextUgly5 = 5;
		
		int i=0;
		for(i=1;i<n;i++) {
			ugly[i] = Math.min(nextUgly2, Math.min(nextUgly3, nextUgly5));
			if(ugly[i]==nextUgly2) {
				n2 = n2+1;
				nextUgly2=ugly[n2];
			}
			if(ugly[i]==nextUgly3) {
				n3 = n3+1;
				nextUgly3=ugly[n3];
	
			}
			
			if(ugly[i]==nextUgly5) {
				n5 = n5+1;
				nextUgly5=ugly[n5];
	
			}

		}
		
		return ugly[i];
		
	}

}
