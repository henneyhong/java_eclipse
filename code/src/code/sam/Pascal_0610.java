package code.sam;

import java.util.Scanner;

public class Pascal_0610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ľ�Į �ﰢ��");
		int n = sc.nextInt();

		int[][] pascal = new int[n][n];
		int i, j;

		for (i = 0; i < pascal.length; i++) // 0���� �ʱ�ȭ
			for (j = 0; j < pascal[i].length; j++)
				pascal[i][j] = 0;

		for (i = 0; i < pascal.length; i++) // �Ľ�Į �ﰢ�� ����
			for (j = 0; j < pascal[i].length; j++)
				if (j == 0 || i == j) // i, j ���� �� 1�̵ȴ�
					pascal[i][j] = 1;
				else if (i > j) // ���� ���� �� ����
					pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];

		for (i = 0; i < pascal.length; i++) {
			for (j = 0; j < pascal[i].length; j++)
				if (pascal[i][j] > 0)
					System.out.printf("%3d", pascal[i][j]);
			System.out.println();
		}
	}
}