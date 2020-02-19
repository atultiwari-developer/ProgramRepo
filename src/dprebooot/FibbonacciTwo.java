package dprebooot;
import java.util.Stack;

public class FibbonacciTwo {
	
	public static void main(String[] args) {
		int n  = 10;
		printFibo(n);
	
	}
	
	public static void printFibo(int n) {
		int x = 0;
		int y  =1;
	    Stack<Integer> st = new Stack<>();
		if(n>=0) {
			//System.out.print(x+" ");
			st.push(x);
		}
		if(n>=1) {
			//System.out.print(y+" ");
			//st.push(y);
		}

			for(int i=2;i<n;i++) {
				int z = x+y;
				st.push(z);
				//System.out.print(z+" ");
				x = y;
				y = z;
			}
			
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
	}

}
