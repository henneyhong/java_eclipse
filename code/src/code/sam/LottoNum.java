package code.sam;

public class LottoNum {
	
	public static void main(String[] args) {	
		int lotto[] = new int[6];							//배열 크기 6
		
			while(true) {
				
				for(int i = 0; i < lotto.length; i++) {		//6개 난수
					
//		math 클래스 (int)(Math.random()*(최대값-최소값+1))+최소값 
					int random = (int)(Math.random() * 45 + 1);
					lotto[i] = random;
					
				}
				
				int temp = 0;	
//				증가순으로 정렬
				while (!(lotto[0] <= lotto[1] && lotto[1] <= lotto[2] && lotto[2] <= lotto[3]
						&& lotto[3] <= lotto[4] &&lotto[4] <= lotto[5])) {
					for(int i = 0; i < lotto.length-1; i++) {
						if(lotto[i] <= lotto[i+1]) {
							continue;
						}
						else {
							temp = lotto[i];
							lotto[i] = lotto[i + 1];
							lotto[i + 1] = temp;
						}
					}	
				}
//				중복인경우 중복 출력, 중복아닌 숫자와 같이 출력됨
				if (lotto[0] == lotto[1] | lotto[1] == lotto[2] | lotto[2] == lotto[3] | lotto[3] == lotto[4]
						| lotto[4] == lotto[5]) {
					System.out.println("중복입니다. 다시 실행해주세요.");
					;
				}else {
					break;
				}
			}
//			결과 값 출력
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i]);
				if(i < lotto.length - 1) {
					System.out.print(",");
				}
			}
	}
}