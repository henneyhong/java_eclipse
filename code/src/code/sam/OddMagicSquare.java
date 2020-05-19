
package code.sam;

import java.util.Scanner;

public class OddMagicSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȧ�� �Է�");
		int n = sc.nextInt();
		
		int[][] square = new int[n][n];
		int x= 0;
		int y= n/2;
		int num = 1;
	
		while (num <=n*n) {
			
			square[x][y] = num;
			
			int x2 = x;				//(x,y)�� �ʱⰪ
			int y2 = y;
			
			x--;					
			y--;
			
			if(x<0) {				//������ ������
				x = n-1;			//n-1 �̵�
			}
			
			if(y<0) {				//���� �� ������
				y = n-1;			//n-1 �̵�
			}
			if(square[x][y]!=0) {			//�̵��� ��ġ�� �̹� ���� �ִ� ���
				x=x2+1;
				y=y2;
			}
			num++;						//���ڴ� ����
		}
		for(int i = 0; i<square.length; i++) {
			for(int j=0; j<square[i].length; j++) {
				System.out.println(square[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}
}