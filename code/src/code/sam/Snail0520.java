package code.sam;


import java.util.Scanner;

public class Snail0520 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int[][]snail = new int[n][n];
		int i=0;						//x축	->문제에서 y
		int j=0;						//y축	->문제에서 x
		int num=1;
		int lastnum=n*n;
		int leftright = n;
		int updown = n-1;
		
		while(num <= lastnum) {
			for(int a=0; a< leftright; a++) {
				snail[i][j] = num;
				j++; num++;
			}leftright--; i++; j--;
			for(int a=0; a<updown; a++) {
				snail[i][j] = num;
				i++; num++;
			}updown--; i--; j--;
			for(int a = 0; a<leftright; a++) {
				snail[i][j]=num;
				j--; num++;
			}leftright--; i--; j++;
			for(int a =0 ; a<updown; a++) {
				snail[i][j]=num;
				i--; num++;
			}updown--; i++; j++;
		}
		for(i=0; i<snail.length; i++) {
			for(j=0; j<snail[i].length; j++) {
				System.out.printf("%3d",snail[i][j]);
			}
			System.out.println();
		}
		
	}
}
