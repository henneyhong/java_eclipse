
package code.sam;

import java.util.Scanner;

public class OddMagicSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수 입력");
		int n = sc.nextInt();
		
		int[][] square = new int[n][n];
		int x= 0;
		int y= n/2;
		int num = 1;
	
		while (num <=n*n) {
			
			square[x][y] = num;
			
			int x2 = x;				//(x,y)로 초기값
			int y2 = y;
			
			x--;					
			y--;
			
			if(x<0) {				//윗벽을 넘으면
				x = n-1;			//n-1 이동
			}
			
			if(y<0) {				//왼쪽 벽 넘으면
				y = n-1;			//n-1 이동
			}
			if(square[x][y]!=0) {			//이동한 위치에 이미 값이 있는 경우
				x=x2+1;
				y=y2;
			}
			num++;						//숫자는 증가
		}
		for(int i = 0; i<square.length; i++) {
			for(int j=0; j<square[i].length; j++) {
				System.out.println(square[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}
}