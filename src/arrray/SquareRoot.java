package arrray;

public class SquareRoot {
	
	public static void main(String[] args) {
		int x = 29;
		int low = 0;
		int high = x;
		float y = getSquare(x,low,high);
		System.out.println("the value is"+y);
	}

	private static float getSquare(int x,int low,int high) {
		
		float ans = 0.0f;
		
		while(low<=high) {
		int mid = (low + high)/2;
		if(mid*mid==x) {
			ans = mid;
			break;
		}
		
		else if(mid*mid<x) {
			low = mid+1;
			ans = mid;
		}
		else
			high = mid-1;
		}
		
		int prec = 3;
		double inc = 0.1;
		for(int i=0;i<prec;i++) {
			while(ans*ans<=x)
			{
				ans+=inc;
			}
			ans-=inc;
			inc = inc/10;
			
		}
		
		
		return (float)ans;
	}

}
