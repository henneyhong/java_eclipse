package code.sam;

import java.util.Scanner;

public class UnClockwiseSnail0603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int n = sc.nextInt();
		
		int [][]snail = new int [n][n];
		
		int x = 0;				//x
		int y = 0;				//y
		int updown = n;				//��,�Ʒ��� ������ �� 
		int leftright = n-1;		//������ �����϶�
		int num = 1;				//���� ����	
		int lastnum = n*n;			//������ ���� 
		
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
