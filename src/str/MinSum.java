package str;

public class MinSum {
public static void main(String[] args) {
	
	int x1 = 5466;
	int x2 = 4555;	
	System.out.println("minimum is");
	
	int res1 = replace(x1,6,5)+ replace(x2,6,5);
	System.out.println(res1);
	
	System.out.println("the max is");
	int res2 = replace(x1,5,6)+ replace(x2,5,6);
     System.out.println(res2);
	
	
	
}

public static int replace (int x,int from,int to) {
	int result = 0;
	int mul = 1;
	
	while(x>0) {
		int rem = x%10;
		if(rem==from) {
			result = result + to*mul;
		}
		else {
			result = result + rem*mul;
		}
		
		x = x/10;
		mul*=10;
		
	}
	return result;
	
	
}
}
