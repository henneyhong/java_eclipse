package code.sam;

import java.util.Scanner;

public class Pascal_0610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파스칼 삼각형");
		int n = sc.nextInt();

		int[][] pascal = new int[n][n];
		int i, j;

		for (i = 0; i < pascal.length; i++) // 0으로 초기화
			for (j = 0; j < pascal[i].length; j++)
				pascal[i][j] = 0;

		for (i = 0; i < pascal.length; i++) // 파스칼 삼각형 생성
			for (j = 0; j < pascal[i].length; j++)
				if (j == 0 || i == j) // i, j 같을 때 1이된다
					pascal[i][j] = 1;
				else if (i > j) // 같지 않을 때 공식
					pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];

		for (i = 0; i < pascal.length; i++) {
			for (j = 0; j < pascal[i].length; j++)
				if (pascal[i][j] > 0)
					System.out.printf("%3d", pascal[i][j]);
			System.out.println();
		}
	}
}