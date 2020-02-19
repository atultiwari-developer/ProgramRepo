package arrray.dp;

public class ArraySum {
public static void main(String[] args) {
	int[]arr = {899,356,914,678,534,936,12,455,168,348,288,748,927,304,992,236,115,373,1000,209,486,144,284,738,428,934,993,535,101,21,34};
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum = sum + arr[i];
	}
	System.out.println("the sum is"+ sum);
}
}
