package code.sam;

import java.util.Scanner;

public class UnClockwiseSnail0603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		
		int [][]snail = new int [n][n];
		
		int x = 0;				//x
		int y = 0;				//y
		int updown = n;				//위,아래로 움직일 때 
		int leftright = n-1;		//옆으로 움직일때
		int num = 1;				//시작 숫자	
		int lastnum = n*n;			//마지막 숫자 
		
		while(num <= lastnum) {
			for(int a = 0; a < updown; a++) {
				snail[x][y] = num;
				x++; num ++;
			}updown--; x--; y++;
			
			for(int a = 0; a < leftright; a++) {
				snail[x][y] = num;
				y++; num++;
				
			}leftright--; x--; y--;
			
			for(int a = 0 ; a < updown; a++) {
				snail[x][y] = num;
				x--; num++;
			}updown--; x++; y--;
			
			for (int a = 0; a<leftright; a++) {
				snail[x][y] = num;
				y--; num++;
			}leftright--; x++; y++;
			
			for (x = 0; x < snail.length; x++) {
				for (y = 0; y < snail[x].length; y++) {
					System.out.printf("%3d", snail[x][y]);
				}
				System.out.println();
			}
				
		}
		
		
		
		
	}
}
