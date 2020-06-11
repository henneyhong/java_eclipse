package code.sam;

public class GuguDan_0611 {
	public static void main(String[] args) {
		int[][] gugudan = new int [9][9];
		int Dan, num, result;
		for(Dan = 0; Dan < 9; Dan++)
			for(num = 0; num < 9; num++)
				gugudan[Dan][num] = (Dan +1)*(num + 1);
		
		System.out.println("   1  2  3  4  5  6  7  8  9 " );
		
		for(Dan = 0; Dan < 9; Dan++) {
			System.out.print((Dan +1));
			for(num = 0 ; num < 9; num++) {
				result = gugudan[Dan][num];
				if(result < 10)
					System.out.print("  " + result);
				else
					System.out.print(" " + result);
			}
			System.out.println();
		}
	}

}
