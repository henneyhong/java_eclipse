package code.sam;

import java.util.Scanner;

public class Amicables0525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		int a = sc.nextInt();	//�Է��ϴ� ��
		int b = sc.nextInt();	
		
		
		int na;					//������ ��
		int nb;					
		
		int suma = 0;			//��� ��
		int sumb = 0;
		
		for(na = 1; na < a; na++) {
			if((a % na)==0) {		//���	-> a%na==0
				System.out.print(na + " ,");
				suma = suma + na;				//�ڽ��� �� ����� ��
			}
		}
		System.out.println(a + "�� ��� ����" + suma + "�̴�.");
	
		for(nb = 1; nb < b; nb++) {				//������ �� 1���� 1�� ���� �Է°� ���ں��ٴ� �۰�
			if((b % nb)==0) {
				System.out.print(nb + " ,");
				sumb = sumb + nb;
			}
		}
		System.out.println(b+"�� ��� ����" + sumb + "�̴�.");
		
		if(suma == b||sumb == a) {						//����� ���� ������ ���ڰ� �Ǹ�
			System.out.println("�� ���� ģȭ���̴�.");
		}
		else {
			System.out.println("ģȭ���� �ƴϴ�.");
		}
	}
	
}
