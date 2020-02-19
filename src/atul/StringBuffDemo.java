package atul;

public class StringBuffDemo {
	public static StringBuffer sb;
	
	public static void main(String[] args) {
		sb = new StringBuffer();
		StringBuffDemo obj  = new StringBuffDemo();
		obj.printArray();
		System.out.println(sb);
		
	}
	public void printArray() {
		int[]arr = {1,2,3,4,5,6};
		
		String temp = "";
		for (int i = 0;i<arr.length;i++) {
			temp = arr[i]+" "+temp;
		}
		System.out.print(temp);
	}

}
