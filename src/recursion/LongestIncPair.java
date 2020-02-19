package recursion;

import java.util.Arrays;

public class LongestIncPair {
int a;
int b;
public LongestIncPair(int a ,int b) {
	this.a = a;
	this.b = b;
}

static int maxChainLength(LongestIncPair[]arr,int n) {
	int i,j,max = 0;
    int mcl[] = new int[n];
    Arrays.fill(mcl, 1);

    for(i=1;i<n;i++) {
    	for( j=0;j<i;j++) {
    		if(arr[i].a > arr[j].b && mcl[i]<mcl[j]+1) {
    			mcl[i] = mcl[j]+1;
    		}
    	}
    }
    
    for(int x=0;x<n;x++) {
    	if(max<mcl[x]) {
    		max = mcl[x];
    	}
    }
    return max;
}



public static void main(String[] args) {
	LongestIncPair arr[] = new LongestIncPair[] {new LongestIncPair(5,24), new LongestIncPair(15, 25), 
            new LongestIncPair (27, 40), new LongestIncPair(50, 60)}; 
System.out.println("Length of maximum size chain is " +  
            maxChainLength(arr, arr.length)); 

}
}
