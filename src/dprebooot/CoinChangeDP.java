package dprebooot;

public class CoinChangeDP {
	static int[][]coin;
	public static void main(String[] args) {
		int[]arr = {1,2,3};
		int x = arr.length;
		int k = 4;
		coin = new int[x][k];
		int res = getWays(coin,x,k);
		System.out.println("the res is"+res);
	}
	
	static int getWays(int [][]coin,int x,int k) {
		
		for(int i=0;i<coin.length;i++) {
			coin[i][0] = 1;			
		}
		
		for(int j=0;j<coin[0].length;j++) {
			coin[0][j] = 1;
		}
		for(int p=1;p<coin.length;p++) {
			for(int q=1;q<coin[p].length;q++) {
				if(q-p>0)
				coin[p][q] = coin[p-1][q]+coin[p][q-p-1];
				else if(q-p<0) {
					coin[p][q] = coin[p-1][q];

				}
				else
					coin[p][q] = coin[p-1][q]+coin[p][q-p];

			}
		}
		
		return coin[x-1][k-1];
		
	}

}
