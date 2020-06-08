package code.sam;

import java.util.Scanner;

public class Snail_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			//�迭 �Է�
		int snail[][] = new int [n][n];
		int num = 1;					//ù��° ����
		int lastnum = n*n;				//������ ����
		int i = 0;	//x					
		int j = 0;  //y
		int downUp = n;
		int leftRight = n-1;
		
		while(num <= lastnum) {
			for (int a = 0; a<downUp; a++) {
				snail[i][j] = num;
				i++; num++;
			}downUp--;i--;j++;
			for(int a = 0; a<leftRight; a++) {
				snail[i][j] = num;
				j++;num++;
			}leftRight--; i--;j--;
			for(int a = 0; a<downUp; a++) {
				snail[i][j] = num;
				i--; num++;
			}downUp--;i++;j--;
			for(int a = 0; a<leftRight; a++) {
				snail[i][j] = num;
				j--; num++;
			}leftRight--;i++;j++;	
		
			for(i=0; i<snail.length;i++) {
				for(j=0; j<snail[i].length; j++) {
					System.out.printf("%3d",snail[i][j]);
			}
				System.out.println();
			}
		}
	}
}