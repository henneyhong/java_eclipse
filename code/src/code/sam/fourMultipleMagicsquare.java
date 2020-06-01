package code.sam;

import java.io.IOException;


public class fourMultipleMagicsquare {
	public static void main(String[] args) throws IOException {

		int square[][];
		int val = 1;
		int n = 0;
		int row = 0;
		int col = 0;
		int half;
		int quater;
		
		System.out.print("숫자 입력");
		n = System.in.read()-48;
		
		square = new int [n][n];
		half = n/2;
		quater = half/2;
		
		for(row = 0; row<n; row++) {
			for(col = 0; col<n; col++) {
				if(a(row,col,half,quater) == true) {
					square[row][col] = val;
					
				}else {
					square[row][col] = n*n-val+1;
				}
				val++;
			}
		}
		for(int i = 0; i < n ;i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static boolean a(int row,int col, int half, int quater) {
		if(row < quater || row >= half +quater) {
			if(col < quater || col >= half + quater) {
				return true;
				
			}
		}
		if(row >= quater && row <half + quater) { 
			if(col >= quater && col < half + quater) {
				return true;
			}
		}
			
		return false;
	}

	
}
