package code.sam;

public class LottoNum {
	
	public static void main(String[] args) {	
		int lotto[] = new int[6];							//�迭 ũ�� 6
		
			while(true) {
				
				for(int i = 0; i < lotto.length; i++) {		//6�� ����
					
//		math Ŭ���� (int)(Math.random()*(�ִ밪-�ּҰ�+1))+�ּҰ� 
					int random = (int)(Math.random() * 45 + 1);
					lotto[i] = random;
					
				}
				
				int temp = 0;	
//				���������� ����
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
//				�ߺ��ΰ�� �ߺ� ���, �ߺ��ƴ� ���ڿ� ���� ��µ�
				if (lotto[0] == lotto[1] | lotto[1] == lotto[2] | lotto[2] == lotto[3] | lotto[3] == lotto[4]
						| lotto[4] == lotto[5]) {
					System.out.println("�ߺ��Դϴ�. �ٽ� �������ּ���.");
					;
				}else {
					break;
				}
			}
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i]);
				if(i < lotto.length - 1) {
					System.out.print(",");
				}
			}
	}
}