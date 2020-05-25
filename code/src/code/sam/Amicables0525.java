package code.sam;

import java.util.Scanner;

public class Amicables0525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int a = sc.nextInt();	//입력하는 값
		int b = sc.nextInt();	
		
		
		int na;					//나누는 값
		int nb;					
		
		int suma = 0;			//약수 합
		int sumb = 0;
		
		for(na = 1; na < a; na++) {
			if((a % na)==0) {		//약수	-> a%na==0
				System.out.print(na + " ,");
				suma = suma + na;				//자신을 뺀 약수의 합
			}
		}
		System.out.println(a + "의 약수 합은" + suma + "이다.");
	
		for(nb = 1; nb < b; nb++) {				//나누는 값 1부터 1씩 증가 입력값 숫자보다는 작게
			if((b % nb)==0) {
				System.out.print(nb + " ,");
				sumb = sumb + nb;
			}
		}
		System.out.println(b+"의 약수 합은" + sumb + "이다.");
		
		if(suma == b||sumb == a) {						//약수의 합이 서로의 숫자가 되면
			System.out.println("두 수는 친화수이다.");
		}
		else {
			System.out.println("친화수가 아니다.");
		}
	}
	
}
