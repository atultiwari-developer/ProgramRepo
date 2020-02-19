package arrray.dp;

public class ugliNum {
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("ugly no is"+getUglyNo(n));
		  
		}
	
	public static int getUglyNo(int num) {
		
		int i2=0,i3=0,i5=0;
		int  next_multiple_of2 = 2;
		int  next_multiple_of3 = 3;
		int next_multiple_of5 = 5;
		int[]ugly = new int[num];
		
		ugly[0] = 1;
		int nextUgly= 1;
		
		for(int i=1;i<num;i++) {
			nextUgly = Math.min(next_multiple_of2, Math.min(next_multiple_of3, next_multiple_of5));
			
			ugly[i] = nextUgly;
			if(nextUgly==next_multiple_of2) {
				i2 = i2+1;
				next_multiple_of2 = ugly[i2]*2;
			}
			
			if(nextUgly==next_multiple_of3) {
				i3 = i3+1;
				next_multiple_of3 = ugly[i3]*3;
			}

			if(nextUgly==next_multiple_of5) {
				i5 = i5+1;
				next_multiple_of5 = ugly[i5]*5;
			}

		}

		
		return nextUgly;
	}

	}


